/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   
 
* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.service.api.user.basic;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import cn.blackshop.model.user.entity.User;

/**  

* <p>Title: 用户服务</p>  

* <p>Description:管理用户的API接口 </p>  

* @author zibin  

* @date 2018年12月3日  

*/
public interface UserBasicService {

	 User getUserByNickName(@RequestParam String nickName);

	 List<User> queryUserList();
}
