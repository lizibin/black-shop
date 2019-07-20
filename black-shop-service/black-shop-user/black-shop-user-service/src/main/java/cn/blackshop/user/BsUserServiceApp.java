/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.user;

import cn.blackshop.basic.apollo.constans.ApolloNamespaceConstant;
import cn.blackshop.common.feign.annotation.EnableBsFeignClients;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * BsUserServiceApp用户基础服务启动类
 *
 * @author zibin
 */
@EnableApolloConfig({ApolloNamespaceConstant.PUBLIC_NACOS_CONFIG})
@SpringCloudApplication
@EnableBsFeignClients
public class BsUserServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(BsUserServiceApp.class, args);
	}
}
