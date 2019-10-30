/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */


package cn.blackshop.user.service;


import cn.blackshop.user.entity.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;


/**
 * <p>
 * 菜单权限表 服务类
 * </p>
 *
 * @author zibin
 * @since 1.0.0
 */
public interface SysMenuService extends IService<SysMenu> {

	/**
	 * 更新菜单信息
	 *
	 * @param sysMenu 菜单信息
	 * @return 成功、失败
	 */
	Boolean updateMenuById(SysMenu sysMenu);
}
