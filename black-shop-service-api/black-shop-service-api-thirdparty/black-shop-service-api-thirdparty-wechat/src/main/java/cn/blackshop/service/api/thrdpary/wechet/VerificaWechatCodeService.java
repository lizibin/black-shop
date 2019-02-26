/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.service.api.thrdpary.wechet;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSONObject;

import cn.blackshop.common.basic.core.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * 微信注册验证码接口.
 *
 * @author zibin
 */
@Api(tags = "微信注册码验证码接口")
public interface VerificaWechatCodeService {

  /**
   * 根据手机号码验证码token是否正确.
   */
  @ApiOperation(value = "根据手机号码验证码token是否正确")
  @PostMapping("/verificaWechetCode")
  @ApiImplicitParams({
      @ApiImplicitParam(paramType = "query", name = "mobileNumber", dataType = "String", required = true, value = "用户手机号码"),
      @ApiImplicitParam(paramType = "query", name = "wechatCode", dataType = "String", required = true, value = "微信注册码") })
  ResponseResult<JSONObject> verificaWechatCode(@RequestParam("mobileNumber") String mobileNumber,
      @RequestParam("wechatCode") String wechatCode);
}
