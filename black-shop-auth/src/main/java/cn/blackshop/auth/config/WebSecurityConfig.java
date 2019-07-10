/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018-2050</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.auth.config;

import cn.blackshop.auth.service.CustomerUserDetailsService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * oauth2.0认证用户
 * @author zibin
 *
 */
@Primary
@Order(90)
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  @Autowired
  private CustomerUserDetailsService customerUserDetailsService;
  
  /**
   * 授权认证的用户.
   */
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(customerUserDetailsService);  
  }
  

  /**
   * 配置认证授权的URL.
   */
  @Override
  @SneakyThrows
  protected void configure(HttpSecurity http) throws Exception {
    http.
    authorizeRequests()
    .antMatchers("/actuator/**", "/oauth/removeToken","/p/**").permitAll()
    .anyRequest().authenticated()
    .and().csrf().disable();
    ;
  }
  
  /**
   * 不拦截静态资源
   *
   * @param web
   */
  @Override
  public void configure(WebSecurity web) {
      web.ignoring().antMatchers("/css/**");
  }

  
  @Bean
  @Override
  @SneakyThrows
  public AuthenticationManager authenticationManagerBean() {
      return super.authenticationManagerBean();
  }
  
  @Bean
  public PasswordEncoder passwordEncoder() {
      return PasswordEncoderFactories.createDelegatingPasswordEncoder();
  }
}
