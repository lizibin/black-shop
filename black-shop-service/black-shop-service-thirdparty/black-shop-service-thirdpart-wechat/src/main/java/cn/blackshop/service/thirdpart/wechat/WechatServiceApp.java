/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018-2050</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.service.thirdpart.wechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.spring4all.swagger.EnableSwagger2Doc;

/**
 * wechat run
 * @author zibin
 *  
 */
@EnableDiscoveryClient
@EnableSwagger2Doc
@EnableFeignClients
@SpringBootApplication(scanBasePackages="cn.blackshop")
public class WechatServiceApp {

  public static void main(String[] args) {
    SpringApplication.run(WechatServiceApp.class, args);
  }
}
