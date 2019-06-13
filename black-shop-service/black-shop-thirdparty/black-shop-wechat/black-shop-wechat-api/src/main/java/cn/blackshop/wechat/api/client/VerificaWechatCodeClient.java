/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.wechat.api.client;

import cn.blackshop.common.basic.core.ResponseResult;
import cn.blackshop.wechat.api.constant.WechatServerNameConstant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 微信服务的feign调用
 * @author zibin
 */
@FeignClient(value = WechatServerNameConstant.WECHAT_SERVICE)
public interface VerificaWechatCodeClient {

	/**
	 * 调用微信公众号获取验证码
	 * @param phone
	 * @param weixinCode
	 * @return
	 */
	@PostMapping("/wechat/verificaWechatCode")
	ResponseResult<Boolean> verificaWechatCode(String phone, String weixinCode);
}
