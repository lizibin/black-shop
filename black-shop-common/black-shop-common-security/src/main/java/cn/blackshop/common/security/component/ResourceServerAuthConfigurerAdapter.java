/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */

package cn.blackshop.common.security.component;


import cn.blackshop.common.security.properties.PermitAllUrlProperties;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * 抽象公共默认的配置类
 * @author zibin
 */
public class ResourceServerAuthConfigurerAdapter extends ResourceServerConfigurerAdapter {

	@Autowired
	private PermitAllUrlProperties permitAllUrlProperties;

	/**
	 * 默认资源服务器的配置
	 * @param httpSecurity
	 */
	@Override
	@SneakyThrows
	public void configure(HttpSecurity httpSecurity) {
		httpSecurity.headers().frameOptions().disable();
		ExpressionUrlAuthorizationConfigurer<HttpSecurity>
				.ExpressionInterceptUrlRegistry registry = httpSecurity
				.authorizeRequests();
		permitAllUrlProperties.getIgnoreUrls()
				.forEach(url -> registry.antMatchers(url).permitAll());
		registry.anyRequest().authenticated()
				.and().csrf().disable();
	}

}
