/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018-2050</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.wechat;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * wechat run
 * @author zibin
 *  
 */
@EnableSwagger2Doc
@EnableFeignClients
@SpringCloudApplication
@ComponentScan("cn.blackshop")
public class WechatServiceApp {

  public static void main(String[] args) {
    SpringApplication.run(WechatServiceApp.class, args);
  }
}
