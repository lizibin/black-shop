/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018-2050</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.gateway;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 网关应用.
 * @author zibin
 */
@SpringCloudApplication
//@EnableSwagger2Doc
public class GatewayServiceApp {

  public static void main(String[] args) throws Exception {
      SpringApplication.run(GatewayServiceApp.class, args);
  }
}
