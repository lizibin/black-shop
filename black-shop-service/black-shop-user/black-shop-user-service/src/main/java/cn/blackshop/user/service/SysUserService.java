/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */

package cn.blackshop.user.service;

import cn.blackshop.user.api.dto.UserInfoDTO;
import cn.blackshop.user.api.dto.o.UserOutDTO;
import cn.blackshop.user.api.entity.SysUser;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * SysUserService
 *
 * @author zibin
 */
public interface SysUserService extends IService<SysUser> {

	UserInfoDTO getUserInfo(SysUser sysUser);

	UserOutDTO getUserByUsername(String username);

	List<UserOutDTO> getUserPage(Page page);
}
