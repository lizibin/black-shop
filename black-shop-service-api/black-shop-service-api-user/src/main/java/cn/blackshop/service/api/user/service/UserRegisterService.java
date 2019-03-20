/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018-2050</p>   
 
* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.service.api.user.service;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSONObject;

import cn.blackshop.common.basic.core.ResponseResult;
import cn.blackshop.model.user.dto.enter.UserEnterDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 用户注册api接口
 * @author zibin
 */
@Api(tags="用户注册接口",value="用户注册接口")
public interface UserRegisterService {

     @PostMapping("/register")
	 @ApiOperation(value = "用户注册接口", httpMethod = "POST", notes = "用户注册接口",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	 ResponseResult<JSONObject> register(@RequestBody UserEnterDTO userEnterDTO,@RequestParam("registCode") String registCode);
}
