/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.user;

import cn.blackshop.common.feign.annotation.EnableBsFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * BsUserServiceApp用户基础服务启动类
 *
 * @author zibin
 */
@SpringBootApplication
@EnableBsFeignClients
public class BsUserServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(BsUserServiceApp.class, args);
	}
}
