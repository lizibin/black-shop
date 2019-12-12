/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018-2050</p>

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.wechat.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 微信校验验证码的实现类
 * @author zibin
 */
@Service
@Slf4j
public class VerificaWechatCodeService {

//  @Autowired
//  private RedisUtil redisUtil;
//
//  public ResponseResult<Boolean> verificaWechatCode(String phone, String weixinCode) {
//    // 1.验证码参数是否为空
//    if (StrUtil.isEmpty(phone)) {
//      return ResponseResultManager.setResultError("手机号码不能为空!");
//    }
//    if (StrUtil.isEmpty(weixinCode)) {
//      return ResponseResultManager.setResultError("注册码不能为空!");
//    }
//    // 2.根据手机号码查询redis返回对应的注册码
//    String wecahtCodeKey = Constants.WECHET_CODE_KEY + phone;
//    String redisCode = redisUtil.getString(wecahtCodeKey);
//    if (StrUtil.isEmpty(redisCode)) {
//      return ResponseResultManager.setResultError("注册码可能已经过期!!");
//    }
//    // 3.redis中的注册码与传递参数的weixinCode进行比对
//    if (!redisCode.equals(weixinCode)) {
//      return ResponseResultManager.setResultError("注册码不正确");
//    }
//    // 移出对应验证码
//    redisUtil.delKey(wecahtCodeKey);
//	log.info("验证码比对正确！");
//    return ResponseResultManager.setResultSuccess(Boolean.TRUE);
//  }
}
