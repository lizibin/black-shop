/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.user;

import cn.blackshop.common.feign.annotation.EnableBlackFeignClients;
import cn.blackshop.common.security.annotation.EnableBlackResourceServer;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * BsUserServiceApp用户基础服务启动类
 *
 * @author zibin
 */
@SpringBootApplication
@EnableBlackFeignClients
@EnableSwagger2Doc
@EnableBlackResourceServer
public class BlackUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlackUserServiceApplication.class, args);
	}
}
