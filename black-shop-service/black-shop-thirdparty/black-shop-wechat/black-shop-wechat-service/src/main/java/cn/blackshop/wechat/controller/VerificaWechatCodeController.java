/**

 * <p>Company: www.black-shop.cn</p>

 * <p>Copyright: Copyright (c) 2018-2050</p>

 * black-shop(黑店) 版权所有,并保留所有权利。

 */
package cn.blackshop.wechat.controller;

import cn.blackshop.common.basic.core.ResponseResult;
import cn.blackshop.wechat.service.VerificaWechatCodeService;
import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("wechet")
/**
 * 验证微信验证码
 * @author zibin
 */
public class VerificaWechatCodeController {
    private final VerificaWechatCodeService verificaWechatCodeService;

    @PostMapping("verificaWechatCode")
    public ResponseResult<JSONObject> verificaWechatCode(String phone, String weixinCode){
       return verificaWechatCodeService.verificaWechatCode(phone,weixinCode);
    }

}
