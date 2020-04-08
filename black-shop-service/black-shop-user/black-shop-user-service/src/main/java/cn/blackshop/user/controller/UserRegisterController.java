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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegisterController {

	@GetMapping("/test")
	ResponseResult<String> test() {
		return ResponseResultManager.setResultSuccess("ok吗");
	}
}
