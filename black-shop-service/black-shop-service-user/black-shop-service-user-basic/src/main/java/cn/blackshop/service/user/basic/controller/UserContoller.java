/**

 * <p>Company: www.black-shop.cn</p>

 * <p>Copyright: Copyright (c) 2018</p>

 * @version 1.0

 * black-shop(黑店) 版权所有,并保留所有权利。

 */
package cn.blackshop.service.user.basic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.blackshop.model.user.entity.User;
import cn.blackshop.service.api.user.basic.UserBasicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**

 * <p>Title: 用户控制层</p>

 * <p>Description: </p>

 * @author zibin

 * @date 2018年11月30日

 */
@Slf4j
@RestController
@Api(tags="用户基础接口",value="用户基础接口")
public class UserContoller {

	@Autowired
	private UserBasicService userBasicService;

	@GetMapping("/getUser")
	@ApiOperation(value = "根据用户昵称获取用户信息", httpMethod = "GET", notes = "根据用户昵称获取用户信息",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User getUser(String nickName) {
		log.info("getUser");
		User user = userBasicService.getUserByNickName(nickName);
		return user;
	}

	@GetMapping("queryUserList")
	@ApiOperation(value = "获取用户的集合", httpMethod = "GET", notes = "获取用户的集合",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<User> queryUserList() {
		log.info("queryUser");
		List<User> userList = userBasicService.queryUserList();
		return userList;
	}
	
	@GetMapping("queryUserOrderList")
	@ApiOperation(value = "获取用户订单的集合", httpMethod = "GET", notes = "获取用户订单的集合",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String queryUserOrderList() {
		/*log.info("queryUser");
		List<User> userList = userBasicService.queryUserList();
		return userList;*/
		log.info("获取 用户订单集合");
		return "用户获取订单集合";
	}
}
