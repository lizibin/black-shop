/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.user.service.impl;

import cn.blackshop.common.utils.BeanUtils;
import cn.blackshop.user.api.dto.MenuDTO;
import cn.blackshop.user.api.dto.UserInfoDTO;
import cn.blackshop.user.api.dto.o.SysUserDTO;
import cn.blackshop.user.entity.SysRole;
import cn.blackshop.user.entity.SysUser;
import cn.blackshop.user.mapper.SysUserMapper;
import cn.blackshop.user.service.SysMenuService;
import cn.blackshop.user.service.SysRoleService;
import cn.blackshop.user.service.SysUserService;
import cn.hutool.core.util.ArrayUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * SysUserService
 *
 * @author zibin
 */
@Service
@AllArgsConstructor
@Slf4j
public class SysUserServiceImpl  extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
	private final SysRoleService sysRoleService;
	private final SysMenuService sysMenuService;

	@Override
	public UserInfoDTO getUserInfo(SysUser sysUser) {
		UserInfoDTO userInfo = new UserInfoDTO();
		//设置用户对象实体
		userInfo.setSysUser(BeanUtils.transfrom(SysUserDTO.class,sysUser));
		//设置角色id列表
		List<Integer> roleIds = sysRoleService.findRolesByUserId(sysUser.getUserId())
				.stream()
				.map(SysRole::getRoleId)
				.collect(Collectors.toList());
		userInfo.setRoles(ArrayUtil.toArray(roleIds, Integer.class));
		//设置权限列表
		Set<String> permissions = new HashSet<>();

		roleIds.forEach(roleId->{
			List<String> permissionList = sysMenuService.findMenuByRoleId(roleId)
					.stream()
					.filter(menuDto -> StringUtils.isNotEmpty(menuDto.getPermission()))
					.map(MenuDTO::getPermission)
					.collect(Collectors.toList());
			permissions.addAll(permissionList);
		});
		userInfo.setPermissions(ArrayUtil.toArray(permissions, String.class));
		return userInfo;
	}

	@Override
	public SysUserDTO getUserByUsername(String username) {
		return baseMapper.selectByUsername(username);
	}
}
