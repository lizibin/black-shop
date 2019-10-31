/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.user.api.client;

import cn.blackshop.common.core.basic.ResponseResult;
import cn.blackshop.user.api.constant.UserServerNameConstant;
import cn.blackshop.user.api.dto.UserInfoDTO;
import cn.blackshop.user.api.dto.o.UserOutDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * SysUserServiceClient
 * @author zibin
 */
@FeignClient(contextId = "sysUserServiceClient",value = UserServerNameConstant.BLACK_SHOP_USER_SERVICE)
public interface SysUserServiceClient {

	/**
	 * 通过用户名获取用户信息
	 * @param username
	 * @return
	 */
	@GetMapping("/user/getUserByUsername")
	ResponseResult<UserOutDTO> getUserByUsername(@RequestParam("username") String username);

	/**
	 * 通过用户名获取用户信息、角色、权限等
	 * @param username
	 * @return
	 */
	@GetMapping("/user/info/{username}")
	ResponseResult<UserInfoDTO> info(@PathVariable("username") String username);

	/**
	 * 判断手机号是否存在
	 * @param mobileNumber
	 * @return
	 */
	@PostMapping("/existMobileNumber")
	ResponseResult<Boolean> existMobileNumber(@RequestParam("mobileNumber") String mobileNumber);
}
