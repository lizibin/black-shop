package cn.blackshop.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

import cn.blackshop.common.util.MD5Util;

/**

* <p>Title: Security配置</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2018年12月11日
 */
@Component
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	// 配置认证用户的信息和认证用户的权限
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		/*auth.userDetailsService(myUserDetailService).passwordEncoder(new PasswordEncoder() {

			public boolean matches(CharSequence rawPassword, String encodedPassword) {
				String encode = MD5Util.encode((String) rawPassword);
				encodedPassword=encodedPassword.replace("\r\n", "");
				boolean result = encodedPassword.equals(encode);
				return result;
			}

			public String encode(CharSequence rawPassword) {
				return MD5Util.encode((String) rawPassword);
			}
		});*/
		
		 MD5Util.encode("123456","blackshop");

	}

	// 配置拦截请求资源路径
	protected void configure(HttpSecurity http) throws Exception {
		/*List<Permission> listPermission = permissionMapper.findAllPermission();
		ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry authorizeRequests = http
				.authorizeRequests();
		for (Permission permission : listPermission) {
			authorizeRequests.antMatchers(permission.getUrl()).hasAnyAuthority(permission.getPermTag());
		}
		authorizeRequests.antMatchers("/login").permitAll().antMatchers("/**").fullyAuthenticated().and().formLogin()
				.loginPage("/login").and().csrf().disable();*/

	}
}
