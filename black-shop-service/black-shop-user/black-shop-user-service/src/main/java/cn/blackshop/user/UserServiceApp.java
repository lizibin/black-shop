/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018-2050</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

import cn.blackshop.basic.apollo.constans.ApolloNamespaceConstant;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * UserServiceApp用户基础服务启动类
 * @author zibin
 */
@EnableFeignClients
@EnableDiscoveryClient
@MapperScan("cn.blackshop.user.mapper")
@EnableApolloConfig({ApolloNamespaceConstant.PUBLIC_NACOS_CONFIG,ApolloNamespaceConstant.PUBLIC_RIBBON_CONFIG,ApolloNamespaceConstant.PUBLIC_REDIS_CONFIG}) 
@SpringBootApplication(scanBasePackages="cn.blackshop")
public class UserServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApp.class, args);
	}
}
