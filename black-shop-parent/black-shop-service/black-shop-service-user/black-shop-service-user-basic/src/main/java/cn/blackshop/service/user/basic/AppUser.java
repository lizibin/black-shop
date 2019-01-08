/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.service.user.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import tk.mybatis.spring.annotation.MapperScan;

/**  

* <p>Title: AppUser</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2018年11月30日  

*/
@EnableFeignClients
@MapperScan("cn.blackshop.mapper")
@SpringBootApplication
@EnableDiscoveryClient
public class AppUser {

	public static void main(String[] args) {
		SpringApplication.run(AppUser.class, args);
	}
}
