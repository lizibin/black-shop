/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.service.user.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import tk.mybatis.spring.annotation.MapperScan;

/**  

* <p>Title: AppUserSecurity</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2018年12月18日  

*/
@EnableEurekaClient
@EnableFeignClients
@MapperScan("cn.blackshop.mapper")
@SpringBootApplication
public class AppUserSecurity {
	public static void main(String[] args) {
		SpringApplication.run(AppUserSecurity.class, args);
	}
}
