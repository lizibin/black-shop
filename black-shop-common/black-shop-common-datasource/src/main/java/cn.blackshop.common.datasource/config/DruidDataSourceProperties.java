/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */

package cn.blackshop.common.datasource.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * druid数据源
 * @author zibin
 */
@Component
@ConfigurationProperties("spring.datasource.druid")
@Data
public class DruidDataSourceProperties {
	private String username;
	private String password;
	private String url;
	private String driverClassName;
}
