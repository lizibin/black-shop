/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.common.security.service.impl;

import cn.blackshop.common.core.basic.ResponseResult;
import cn.blackshop.common.security.service.BsUserDetailsService;
import cn.blackshop.user.api.client.SysUserServiceClient;
import cn.blackshop.user.api.dto.o.UserOutDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 * UserDetail实现
 *
 * @author zibin
 */
@AllArgsConstructor
@Service
@Slf4j
public class BsUserDetailsServiceImpl implements BsUserDetailsService {
	private final SysUserServiceClient sysUserServiceClient;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		ResponseResult<UserOutDTO> userOutDto = sysUserServiceClient.getUserByUsername(username);
		if (!userOutDto.hasBody()) {
			log.error("用户信息错误或不存在！！！");
			throw new UsernameNotFoundException("用户不存在");
		}
		System.out.println("进入了");


		return null;
	}

	@Override
	public UserDetails loadUserBySocial(String type) throws UsernameNotFoundException {
		return null;
	}

}
