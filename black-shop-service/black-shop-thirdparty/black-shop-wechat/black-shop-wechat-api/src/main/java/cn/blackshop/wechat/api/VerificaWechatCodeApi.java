/**

 * <p>Company: www.black-shop.cn</p>

 * <p>Copyright: Copyright (c) 2018-2050</p>

 * black-shop(黑店) 版权所有,并保留所有权利。

 */
package cn.blackshop.wechat.api.constant;

import cn.blackshop.common.basic.core.ResponseResult;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wechat")
public interface VerificaWechatCodeApi {

    @PostMapping("verificaWechatCode")
    ResponseResult<JSONObject> verificaWechatCode(String phone, String weixinCode);
}
