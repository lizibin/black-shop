/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.mapper;

import org.apache.ibatis.annotations.Mapper;

import cn.blackshop.model.User;
import tk.mybatis.mapper.common.BaseMapper;

/**

* <p>Title: 用户类</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2018年12月6日  

*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

    User getUser(Integer id);

}
