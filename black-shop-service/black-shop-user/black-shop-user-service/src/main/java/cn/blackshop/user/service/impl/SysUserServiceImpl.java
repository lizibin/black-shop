/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.user.service.impl;

import cn.blackshop.common.core.basic.ResponseResult;
import cn.blackshop.common.utils.BeanUtils;
import cn.blackshop.user.api.dto.UserInfoDTO;
import cn.blackshop.user.api.dto.o.SysUserDTO;
import cn.blackshop.user.api.dto.o.UserOutDTO;
import cn.blackshop.user.entity.SysUser;
import cn.blackshop.user.mapper.SysUserMapper;
import cn.blackshop.user.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * SysUserService
 *
 * @author zibin
 */
@Service
@AllArgsConstructor
@Slf4j
public class SysUserServiceImpl  extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
	private final SysUserMapper sysUserMapper;

	@Override
	public UserInfoDTO getUserInfo(SysUser sysUser) {
		UserInfoDTO userInfo = new UserInfoDTO();
		userInfo.setSysUser(BeanUtils.transfrom(SysUserDTO.class,sysUser));
		return userInfo;
	}

	@Override
	public SysUserDTO getUserByUsername(String username) {
		return sysUserMapper.selectByUsername(username);
	}
}
