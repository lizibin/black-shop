/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */

package cn.blackshop.order;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * BsProductServiceApp用户基础服务启动类
 *
 * @author zibin
 */
@SpringBootApplication
@EnableSwagger2Doc
public class BsOrderServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(BsOrderServiceApp.class, args);
	}
}
