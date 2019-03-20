/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018-2050</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.service.user.client;

import org.springframework.cloud.openfeign.FeignClient;

import cn.blackshop.service.api.thrdpary.constant.WechatServerNameConstant;
import cn.blackshop.service.api.thrdpary.wechet.VerificaWechatCodeService;

/**
 * The Interface VerificaWechatCodeServiceClient.
 */
@FeignClient(WechatServerNameConstant.WECHAT_SERVICE)
public interface VerificaWechatCodeServiceClient extends VerificaWechatCodeService{}
