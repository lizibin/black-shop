/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018-2050</p>

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.wechat.service;

import cn.blackshop.basic.redis.util.RedisUtil;
import cn.blackshop.common.basic.constants.Constants;
import cn.blackshop.common.basic.core.ApiService;
import cn.blackshop.common.basic.core.ResponseResult;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 微信校验验证码的实现类
 */
@Service
public class VerificaWechatCodeService extends ApiService<JSONObject> {

  @Autowired
  private RedisUtil redisUtil;

  public ResponseResult<JSONObject> verificaWechatCode(String phone, String weixinCode) {
    // 1.验证码参数是否为空
    if (StringUtils.isEmpty(phone)) {
      return setResultError("手机号码不能为空!");
    }
    if (StringUtils.isEmpty(weixinCode)) {
      return setResultError("注册码不能为空!");
    }
    // 2.根据手机号码查询redis返回对应的注册码
    String weixinCodeKey = Constants.WECHET_CODE_KEY + phone;
    String redisCode = redisUtil.get(weixinCodeKey);
    if (StringUtils.isEmpty(redisCode)) {
      return setResultError("注册码可能已经过期!!");
    }
    // 3.redis中的注册码与传递参数的weixinCode进行比对
    if (!redisCode.equals(weixinCode)) {
      return setResultError("注册码不正确");
    }
    // 移出对应验证码
    redisUtil.delete(weixinCodeKey);
    return setResultSuccess("验证码比对正确");
  }

}
