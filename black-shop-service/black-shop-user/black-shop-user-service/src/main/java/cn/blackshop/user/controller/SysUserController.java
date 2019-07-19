/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.user.controller;

import cn.blackshop.common.core.basic.ResponseResult;
import cn.blackshop.common.core.basic.ResponseResultManager;
import cn.blackshop.common.utils.BeanUtils;
import cn.blackshop.user.api.dto.o.UserOutDTO;
import cn.blackshop.user.service.SysUserService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 用户控制层
 *
 * @author zibin
 */
@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class SysUserController {

	private final SysUserService sysUserService;


	@GetMapping("/getUserByUsername")
	@ApiOperation(value = "根据用户昵称获取用户信息", httpMethod = "GET", notes = "根据用户名获取用户信息")
	ResponseResult<UserOutDTO> getUserByUsername(@RequestParam("username") String username) {
		return ResponseResultManager.setResultSuccess(BeanUtils.transfrom(UserOutDTO.class, sysUserService.getUserByUsername(username)));
	}

	@PostMapping("/existMobileNumber")
	@ApiOperation(value = "判断手机号码是否存在", httpMethod = "POST", notes = "判断手机号码是否存在")
	ResponseResult<Boolean> existMobileNumber(@RequestParam("mobileNumber") String mobileNumber) {
		return ResponseResultManager.setResultSuccess(Boolean.TRUE);
	}

}