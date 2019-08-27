/**

 * <p>Company: www.black-shop.cn</p>

 * <p>Copyright: Copyright (c) 2018</p>

 * black-shop(黑店) 版权所有,并保留所有权利。

 */

package cn.blackshop.user.mapper;

import cn.blackshop.user.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * 系统用户
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
	
	/**
	 * 查询用户的所有权限
	 * @param userId  用户ID
	 */
	List<String> queryAllPerms(Long userId);

	
	/**
	 * 根据用户名获取管理员用户
	 * @param username
	 * @return
	 */
	SysUser selectByUsername(String username);

}
