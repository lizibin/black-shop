/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.user.service.impl;

import cn.blackshop.common.utils.BeanUtils;
import cn.blackshop.user.api.dto.UserInfoDTO;
import cn.blackshop.user.api.dto.o.SysUserDTO;
import cn.blackshop.user.entity.SysRole;
import cn.blackshop.user.entity.SysUser;
import cn.blackshop.user.mapper.SysRoleMapper;
import cn.blackshop.user.mapper.SysUserMapper;
import cn.blackshop.user.service.SysRoleService;
import cn.blackshop.user.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * SysUserService
 *
 * @author zibin
 */
@Service
@AllArgsConstructor
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

	/**
	 * 通过用户ID，查询角色信息
	 *
	 * @param userId
	 * @return
	 */
	@Override
	public List findRolesByUserId(Integer userId) {
		return baseMapper.listRolesByUserId(userId);
	}
}
