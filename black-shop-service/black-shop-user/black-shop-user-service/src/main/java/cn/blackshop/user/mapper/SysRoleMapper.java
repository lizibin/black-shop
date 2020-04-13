/**

 * <p>Company: www.black-shop.cn</p>

 * <p>Copyright: Copyright (c) 2018</p>

 * black-shop(黑店) 版权所有,并保留所有权利。

 */

package cn.blackshop.user.mapper;

import cn.blackshop.user.api.entity.SysRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysRoleMapper extends BaseMapper<SysRole> {

	/**
	 * 通过用户ID，查询角色信息
	 *
	 * @param userId
	 * @return
	 */
	List<SysRole> listRolesByUserId(Integer userId);
}
