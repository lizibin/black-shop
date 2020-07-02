/**

 * <p>Company: www.black-shop.cn</p>

 * <p>Copyright: Copyright (c) 2018-2050</p>

 * black-shop(黑店) 版权所有,并保留所有权利。

 */
package cn.blackshop.wechat.controller;

import cn.blackshop.common.core.basic.ResponseResult;
import cn.blackshop.wechat.service.VerificaWechatCodeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 验证微信验证码
 * @author zibin
 */
@RestController
@AllArgsConstructor
@RequestMapping("/wechat")
public class VerificaWechatCodeController {
    private final VerificaWechatCodeService verificaWechatCodeService;

    @PostMapping("/verificaWechatCode")
    public ResponseResult<Boolean> verificaWechatCode(@RequestParam  String phone,@RequestParam  String weixinCode){
       //return verificaWechatCodeService.verificaWechatCode(phone,weixinCode);
		return null;
    }

}
