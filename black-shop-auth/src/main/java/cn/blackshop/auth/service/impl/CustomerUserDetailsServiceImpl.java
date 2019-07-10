package cn.blackshop.auth.service.impl;

import cn.blackshop.auth.service.CustomerUserDetailsService;
import cn.blackshop.user.api.client.UserServiceClient;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 * UserDetail实现
 * @author zibin
 */
@AllArgsConstructor
@Service
public class CustomerUserDetailsServiceImpl  implements CustomerUserDetailsService {
  private final UserServiceClient userServiceClient;
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    userServiceClient.getUserByUserName(username);
    
    return null;
  }

  @Override
  public UserDetails loadUserBySocial(String type) throws UsernameNotFoundException {
    return null;
  }

}
