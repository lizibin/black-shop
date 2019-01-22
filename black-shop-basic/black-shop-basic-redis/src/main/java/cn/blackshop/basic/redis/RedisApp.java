/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.basic.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**  

* <p>Title: ApolloApp</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2018年11月26日  

*/
@SpringBootApplication
@EnableDiscoveryClient
public class RedisApp {
	public static void main(String[] args) {
			SpringApplication.run(RedisApp.class, args);
	}
}
