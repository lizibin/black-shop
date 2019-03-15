/**
 * 
 * LegendShop微服务商城系统
 * 
 * ©版权所有,并保留所有权利。
 * 
 */
package cn.blackshop.baisc.auth.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

import cn.blackshop.baisc.auth.service.CustomerUserDetailsService;
import cn.blackshop.common.basic.constants.SecurityConstants;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

/**
 * oauth2.0认证服务
 * @author zibin
 */
@Configuration
@AllArgsConstructor
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

  private final AuthenticationManager authenticationManager;
  private final RedisConnectionFactory redisConnectionFactory;
  private final DataSource dataSource;
  private final CustomerUserDetailsService customerUserDetailsService;

  /**
   * 设置client去数据库读取信息
   */
  @Override
  @SneakyThrows
  public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
    JdbcClientDetailsService jdbcClientDetailsService = new JdbcClientDetailsService(dataSource);
    jdbcClientDetailsService.setSelectClientDetailsSql(SecurityConstants.DEFAULT_SELECT_STATEMENT);
    jdbcClientDetailsService.setFindClientDetailsSql(SecurityConstants.DEFAULT_FIND_STATEMENT);
    clients.withClientDetails(jdbcClientDetailsService);
  }

  /**
   * 检查tokenURL开启 /oauth/check_token
   */
  @Override
  public void configure(AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
    oauthServer.allowFormAuthenticationForClients().checkTokenAccess("isAuthenticated()");
  }

  /**
   * 设置redis读取token以及保存token
   */
  @Override
  public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
    // 建立一个Token存储的配置项，此时将Token直接保存在Redis之中
    endpoints
        .allowedTokenEndpointRequestMethods(HttpMethod.GET, HttpMethod.POST)
        .tokenStore(tokenStore())
        .userDetailsService(customerUserDetailsService)
        .authenticationManager(authenticationManager)
        .tokenStore(tokenStore());
  }

  @Bean
  public TokenStore tokenStore() {
    RedisTokenStore tokenStore = new RedisTokenStore(redisConnectionFactory);
   /* tokenStore.setPrefix(SecurityConstants.B2C_PREFIX + "-" + SecurityConstants.OAUTH_PREFIX);*/
    return tokenStore;
  }

  /**
   * token增强
   * 
   * @return TokenEnhancer
   */
 /* @Bean
  public TokenEnhancer tokenEnhancer() {
    return (accessToken, authentication) -> {
      if (SecurityConstants.CLIENT_CREDENTIALS.equals(authentication.getOAuth2Request().getGrantType())) {
        return accessToken;
      }

      final Map<String, Object> additionalInfo = new HashMap<>(8);
      SecurityUserDetail securityUserDetail = (SecurityUserDetail) authentication.getUserAuthentication()
          .getPrincipal();

      additionalInfo.put("id", securityUserDetail.getId());
      additionalInfo.put("username", securityUserDetail.getUsername());
      ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(additionalInfo);
      return accessToken;
    };
  }*/
}
