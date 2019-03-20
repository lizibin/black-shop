/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.baisc.auth.client;

import org.springframework.cloud.openfeign.FeignClient;

import cn.blackshop.service.api.user.constant.UserServerNameConstant;
import cn.blackshop.service.api.user.service.UserService;

/**
 * The Interface UserServiceClient.
 */
@FeignClient(UserServerNameConstant.USER_BASIC_SERVICE)
public interface UserServiceClient extends UserService{}
