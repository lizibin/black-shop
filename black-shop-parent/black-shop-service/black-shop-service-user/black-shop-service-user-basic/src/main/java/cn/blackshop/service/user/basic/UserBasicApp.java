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

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

import cn.blackshop.basic.apollo.constans.ApolloNamespaceConstant;
import tk.mybatis.spring.annotation.MapperScan;

/**  

* <p>Title: UserBasicApp用户基础服务启动类</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2018年11月30日  

*/
@EnableFeignClients
@MapperScan("cn.blackshop.service.user.basic.mapper")
@EnableDiscoveryClient
@EnableApolloConfig({ApolloNamespaceConstant.PUBLIC_NACOS_CONFIG,ApolloNamespaceConstant.PUBLIC_RIBBON_CONFIG}) 
@SpringBootApplication
public class UserBasicApp {

	public static void main(String[] args) {
		SpringApplication.run(UserBasicApp.class, args);
	}
}
