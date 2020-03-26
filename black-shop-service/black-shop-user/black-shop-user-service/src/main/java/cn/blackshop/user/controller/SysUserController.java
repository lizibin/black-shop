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
import cn.blackshop.user.api.dto.o.SysUserDTO;
import cn.blackshop.user.api.dto.o.UserOutDTO;
import cn.blackshop.user.entity.SysUser;
import cn.blackshop.user.service.SysUserService;
import cn.hutool.crypto.SmUtil;
import cn.hutool.http.HttpStatus;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import io.swagger.annotations.Api;
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
@Api(value="系统用户接口",tags = "系统用户接口")
public class SysUserController {

	private final SysUserService sysUserService;


	@GetMapping("/getUserByUsername")
	@ApiOperation(value = "根据用户名获取用户信息", httpMethod = "GET", notes = "根据用户名获取用户信息")
	ResponseResult<UserOutDTO> getUserByUsername(@RequestParam("username") String username) {
		return ResponseResultManager.setResultSuccess(sysUserService.getUserByUsername(username));
	}

	/**
	 * 获取指定用户信息
	 * 包括用户实体、角色、权限
	 *
	 * @return 获取用户信息
	 */
	@GetMapping("/info/{username}")
	public ResponseResult info(@PathVariable String username) {
		SysUser user = sysUserService.getOne(Wrappers.<SysUser>query()
				.lambda().eq(SysUser::getUsername, username));
		if (user == null) {
			return ResponseResultManager.setResultError(HttpStatus.HTTP_UNAUTHORIZED, String.format("用户信息为空 %s", username));
		}
		return ResponseResultManager.setResultSuccess(sysUserService.getUserInfo(user));
	}

	@PostMapping("/existMobileNumber")
	@ApiOperation(value = "判断手机号码是否存在", httpMethod = "POST", notes = "判断手机号码是否存在")
	ResponseResult<Boolean> existMobileNumber(@RequestParam("mobileNumber") String mobileNumber) {
		return ResponseResultManager.setResultSuccess(Boolean.TRUE);
	}

}