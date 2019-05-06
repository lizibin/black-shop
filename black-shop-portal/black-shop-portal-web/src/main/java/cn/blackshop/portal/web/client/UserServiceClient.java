/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018-2050</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.portal.web.client;

import cn.blackshop.user.api.UserServiceApi;
import cn.blackshop.user.api.constant.UserServerNameConstant;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(UserServerNameConstant.BS_USER_SERVICE)
public interface UserServiceClient extends UserServiceApi {}
