/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.basic.apollo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**  

* <p>Title: ApolloIndexController</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2018年11月26日  

*/
@RestController
public class ApolloIndexController {

	private String apollo;
	
	
	@RequestMapping("/getApollo")
	public String getApollo() {
		return apollo;
	}
}
