/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.impl;

import cn.blackshop.service.UserService;
import org.springframework.stereotype.Service;

/**

* <p>Title: UserServiceImpl</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2018年12月3日  

*/
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Override
    public String getUser() {
        return "success";
    }
}
