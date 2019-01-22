/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.service.user.security.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import cn.blackshop.service.user.security.dto.MyUserDetails;

/**  

* <p>Title: MyUserDetailsService</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2019年1月18日  

*/
public class MyUserDetailsService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
        //构建用户信息的逻辑(取数据库/LDAP等用户信息)
        MyUserDetails userInfo = new MyUserDetails();
        userInfo.setUsername(username); // 任意用户名登录

        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodePassword= passwordEncoder.encode("123456");
        userInfo.setPassword(encodePassword);
        Set<GrantedAuthority> authoritiesSet = new HashSet<GrantedAuthority>();
        GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_ADMIN"); // 模拟从数据库中获取用户角色

        authoritiesSet.add(authority);
        userInfo.setAuthorities(authoritiesSet);
        return userInfo;
	}

}
