/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018-2050</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.user.client;

import cn.blackshop.wechat.api.constant.VerificaWechatCodeApi;
import cn.blackshop.wechat.api.constant.WechatServerNameConstant;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * The Interface VerificaWechatCodeServiceClient.
 */
@FeignClient(WechatServerNameConstant.WECHAT_SERVICE)
public interface VerificaWechatCodeServiceClient extends VerificaWechatCodeApi {}
