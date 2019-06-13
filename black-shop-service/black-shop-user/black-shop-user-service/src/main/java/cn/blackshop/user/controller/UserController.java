/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.user.controller;

import cn.blackshop.common.basic.core.ResponseResult;
import cn.blackshop.common.basic.core.ResponseResultManager;
import cn.blackshop.model.user.dto.out.UserOutDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import cn.blackshop.basic.redis.util.RedisUtil;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	private RedisUtil redisUtil;

	@GetMapping("/getUserByNickName")
	@ApiOperation(value = "根据用户昵称获取用户信息", httpMethod = "GET", notes = "根据用户昵称获取用户信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	ResponseResult<UserOutDTO> getUserByNickName(@RequestParam("nickName") String nickName) {

		return null;
	}

	@GetMapping("/getUserByUserName")
	@ApiOperation(value = "根据用户昵称获取用户信息", httpMethod = "GET", notes = "根据用户名获取用户信息", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	ResponseResult<UserOutDTO> getUserByUserName(@RequestParam("userName") String userName) {
		return null;
	}

	@GetMapping("/queryUserList")
	@ApiOperation(value = "获取用户的集合", httpMethod = "GET", notes = "获取用户的集合", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	ResponseResult<List<UserOutDTO>> queryUserList() {
		return null;
	}

	@PostMapping("/existMobileNumber")
	@ApiOperation(value = "判断手机号码是否存在", httpMethod = "POST", notes = "判断手机号码是否存在", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	ResponseResult<Boolean> existMobileNumber(@RequestParam("mobileNumber") String mobileNumber) {
		return ResponseResultManager.setResultSuccess(Boolean.TRUE);
	}

	@GetMapping("/getUserInfo")
	@ApiOperation(value = "/getUserInfo")
	ResponseResult<UserOutDTO> getUserInfo(@RequestParam("token") String token) {
		return null;
	}
}