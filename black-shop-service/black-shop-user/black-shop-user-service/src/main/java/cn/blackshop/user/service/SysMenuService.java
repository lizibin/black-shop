/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */


package cn.blackshop.user.service;


import cn.blackshop.user.api.dto.MenuDTO;
import cn.blackshop.user.entity.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


/**
 * <p>
 * 菜单权限表接口
 * </p>
 *
 * @author zibin
 * @since 1.0.0
 */
public interface SysMenuService extends IService<SysMenu> {

	/**
	 * 通过角色编号查询URL 权限
	 *
	 * @param roleId 角色ID
	 * @return 菜单列表
	 */
	List<MenuDTO> findMenuByRoleId(Integer roleId);
}
