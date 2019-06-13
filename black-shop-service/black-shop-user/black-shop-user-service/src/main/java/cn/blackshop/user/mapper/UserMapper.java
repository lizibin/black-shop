/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.user.mapper;

import cn.blackshop.model.user.entity.User;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

/**
 * 用户mapper类
 * @author zibin
 */
public interface UserMapper extends BaseMapper<User> {

	User getUserByNickName(String nickName);

	List<User> queryUserList();

	User existMobileNumber();

	int register(User userDo);

}
