/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.service.thirdpart.wechat.client;

import org.springframework.cloud.openfeign.FeignClient;

import cn.blackshop.service.api.user.basic.UserBasicService;
import cn.blackshop.service.api.user.constant.UserBasicServerNameConstant;

/**
 * 客户端调用
 * @author zibin
 */
@FeignClient(UserBasicServerNameConstant.USER_BASIC_SERVICE)
public interface UserBasicServiceClient extends UserBasicService {}
