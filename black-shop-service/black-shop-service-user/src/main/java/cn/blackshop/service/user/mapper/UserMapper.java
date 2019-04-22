/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.service.user.mapper;

import java.util.List;

import cn.blackshop.model.user.entity.User;
import tk.mybatis.mapper.common.BaseMapper;

/**
 *       用户mapper类
 * @author zibin
 */
public interface UserMapper extends BaseMapper<User> {

    User getUserByNickName(String nickName);
    
    List<User> queryUserList();

    User existMobileNumber();
    
    int register(User userDo);

}
