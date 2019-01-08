/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

/**  

* <p>Title: ApolloApp</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2018年11月26日  

*/
@SpringBootApplication
@EnableApolloConfig
@EnableEurekaClient
public class ApolloApp {
	public static void main(String[] args) {
			SpringApplication.run(ApolloApp.class, args);
	}
}
