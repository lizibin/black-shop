package cn.blackshop.baisc.auth.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import cn.blackshop.baisc.auth.client.UserServiceClient;
import cn.blackshop.baisc.auth.service.CustomerUserDetailsService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
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
