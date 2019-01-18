/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.service.user.security.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

import cn.blackshop.service.user.security.service.impl.MyUserDetailsService;

/**  

* <p>Title: MyAuthenticationProvider</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2019年1月18日  

*/
public class MyAuthenticationProvider implements AuthenticationProvider {

	 @Autowired
	 MyUserDetailsService userDetailsService;
	 
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String userName = (String) authentication.getPrincipal(); // 这个获取表单输入中返回的用户名;
        String password = (String) authentication.getCredentials(); // 这个是表单中输入的密码；

      /*  Md5PasswordEncoder md5PasswordEncoder = new Md5PasswordEncoder();
        String encodePwd = md5PasswordEncoder.encodePassword(password, userName);*/

        UserDetails userInfo = userDetailsService.loadUserByUsername(userName);

       /* if (!userInfo.getPassword().equals(encodePwd)) {
            throw new BadCredentialsException("用户名密码不正确，请重新登陆！");
        }*/

        return new UsernamePasswordAuthenticationToken(userName, password, userInfo.getAuthorities());
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return false;
	}

}
