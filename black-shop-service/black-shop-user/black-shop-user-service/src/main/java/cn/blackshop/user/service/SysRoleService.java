/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */

package cn.blackshop.user.service;

import cn.blackshop.user.api.entity.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *
 * 用户角色接口
 * @author zibin
 * @since  1.0.0
 *
 */
public interface SysRoleService extends IService<SysRole> {

	/**
	 * 通过用户ID，查询角色信息
	 *
	 * @param userId
	 * @return
	 */
	List<SysRole> findRolesByUserId(Integer userId);

	/**
	 * 通过角色ID，删除角色
	 *
	 * @param id
	 * @return
	 */
//	Boolean removeRoleById(Integer id);
}
