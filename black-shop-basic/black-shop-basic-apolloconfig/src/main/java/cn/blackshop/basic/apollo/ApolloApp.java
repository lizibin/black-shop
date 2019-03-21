/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018-2050</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.basic.apollo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

/**
 * apollo测试启动
 * @author zibin
 *
 */
@SpringBootApplication
@EnableApolloConfig
@EnableDiscoveryClient
public class ApolloApp {
	public static void main(String[] args) {
			SpringApplication.run(ApolloApp.class, args);
	}
}
