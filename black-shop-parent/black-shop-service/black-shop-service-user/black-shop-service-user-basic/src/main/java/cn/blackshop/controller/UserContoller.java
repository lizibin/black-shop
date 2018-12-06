/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.blackshop.service.UserService;
import lombok.extern.slf4j.Slf4j;

/**  

* <p>Title: 用户控制层</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2018年11月30日  

*/
@RestController
@Slf4j
public class UserContoller {

	@Autowired
	private UserService userService;
	
	@GetMapping("/getUser")
	public String getUser() {
		log.info("getUser");
		userService.getUser();
		return "success";
	}
}
