/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018-2050</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.portal.web.client;

import org.springframework.cloud.openfeign.FeignClient;

import cn.blackshop.service.api.user.constant.UserServerNameConstant;
import cn.blackshop.service.api.user.service.UserService;

@FeignClient(UserServerNameConstant.BS_USER_SERVICE)
public interface UserServiceClient extends UserService{}
