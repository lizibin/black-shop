/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018-2050</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.common.security.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Getter;

/**
 * 扩展user类
 * @author zibin
 */
public class SecurityUserDetail extends User {

  private static final long serialVersionUID = -5264301204847053336L;
  /**
   * 用户ID
   */
  @Getter
  private String userId;

  public SecurityUserDetail(String userId, String username, String password, boolean enabled, boolean accountNonExpired,
      boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
    super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    this.userId = userId;
  }
}