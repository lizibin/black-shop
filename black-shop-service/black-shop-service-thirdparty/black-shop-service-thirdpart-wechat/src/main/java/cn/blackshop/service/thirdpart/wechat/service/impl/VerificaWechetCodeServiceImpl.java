package cn.blackshop.service.thirdpart.wechat.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import cn.blackshop.basic.redis.util.RedisUtil;
import cn.blackshop.common.basic.constants.Constants;
import cn.blackshop.common.basic.core.ApiService;
import cn.blackshop.common.basic.core.ResponseResult;
import cn.blackshop.service.api.thrdpary.wechet.VerificaWechetCodeService;

@RestController
public class VerificaWechetCodeServiceImpl extends ApiService<JSONObject> implements VerificaWechetCodeService {

  @Autowired
  private RedisUtil redisUtil;

  @Override
  public ResponseResult<JSONObject> verificaWechetCode(String phone, String weixinCode) {
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
