/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018-2050</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 认证服务器 oauth2.0
 * @author zibin
 */
@SpringCloudApplication
@EnableFeignClients
public class AuthService {
  public static void main(String[] args) {
    SpringApplication.run(AuthService.class, args);
  }
}
