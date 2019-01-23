/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   
 
* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.service.api.user.basic;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.blackshop.common.basic.core.ResponseResult;
import cn.blackshop.model.user.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 用户服务api接口
 * @author zibin
 */
@Api(tags="用户基础接口",value="用户基础接口")
public interface UserBasicService {

	 @GetMapping("/getUserByNickName")
	 @ApiOperation(value = "根据用户昵称获取用户信息", httpMethod = "GET", notes = "根据用户昵称获取用户信息",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	 ResponseResult<User> getUserByNickName(@RequestParam String nickName);

	 @GetMapping("queryUserList")
	 @ApiOperation(value = "获取用户的集合", httpMethod = "GET", notes = "获取用户的集合",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	 ResponseResult<List<User>> queryUserList();
}
