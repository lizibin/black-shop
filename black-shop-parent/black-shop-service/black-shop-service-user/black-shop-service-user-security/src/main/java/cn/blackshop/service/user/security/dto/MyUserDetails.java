/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.service.user.security.dto;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

/**  

* <p>Title: MyUserDetails</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2019年1月18日  

*/
@Data
public class MyUserDetails  implements UserDetails, Serializable{

	 /** serialVersionUID*/  
	private static final long serialVersionUID = 1696981507301825540L;
	
	private String username;
	private String password;
	private Set<? extends GrantedAuthority> authorities;
	 
	 
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}

	@Override
	public String getPassword() {
		return this.password;
	}
	@Override
	public String getUsername() {
		return this.username;
	}

	@Override
	public boolean isAccountNonExpired() {
		 return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		 return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		 return true;
	}

	@Override
	public boolean isEnabled() {
		 return true;
	}
}
