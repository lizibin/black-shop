/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.baisc.auth.client;

import cn.blackshop.user.api.constant.UserServerNameConstant;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * The Interface UserServiceClient.
 */
@FeignClient(UserServerNameConstant.BS_USER_SERVICE)
public interface UserServiceClient extends cn.blackshop.user.api.client.UserServiceClient {}
