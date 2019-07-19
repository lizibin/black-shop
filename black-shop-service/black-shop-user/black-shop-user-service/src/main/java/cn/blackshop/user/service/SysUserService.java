/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.user.service;

import cn.blackshop.common.core.basic.ResponseResult;
import cn.blackshop.user.api.dto.o.UserOutDTO;
import cn.blackshop.user.entity.SysUser;
import cn.blackshop.user.mapper.SysUserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * UserBasicServiceImpl
 *
 * @author zibin
 */
@Service
@AllArgsConstructor
public class SysUserService {
	private final SysUserMapper sysUserMapper;

	public ResponseResult<UserOutDTO> getUserInfo(String token) {
		return null;
	}

	public SysUser getUserByUsername(String username) {
		return sysUserMapper.selectByUsername(username);
	}
}
