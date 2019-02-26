/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.service.thirdpart.wechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.spring4all.swagger.EnableSwagger2Doc;

/**
 * 启动类.
 * @author zibin
 */
@EnableDiscoveryClient
@EnableSwagger2Doc
@EnableFeignClients
@SpringBootApplication(scanBasePackages="cn.blackshop")
public class WechatApp {

  /**
   * 启动类
   * @param args
   */
  public static void main(String[] args) {
    SpringApplication.run(WechatApp.class, args);
  }
}
