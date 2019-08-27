/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.user.config;

import cn.blackshop.common.datasource.config.DataSourceConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 加载apllo数据源
 *
 * @author zibin
 */
@Configuration
@Data
@EqualsAndHashCode(callSuper = false)
public class UserDataSourceConfig extends DataSourceConfig {

	/**
	 * 数据库url
	 */
	@Value("${spring.datasource.url}")
	private String url;

	/**
	 * 数据用户名
	 */
	@Value("${spring.datasource.username}")
	private String userName;

	/**
	 * 数据库密码
	 */
	@Value("${spring.datasource.password}")
	private String passWord;
}
