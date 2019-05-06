/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.user.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

import cn.blackshop.basic.apollo.config.DataSourceConfig;
import cn.blackshop.basic.apollo.constans.ApolloNamespaceConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 加载apllo数据源
 * @author zibin
 *
 */
@Configuration
@Data
@EqualsAndHashCode(callSuper=false)
@EnableApolloConfig(ApolloNamespaceConstant.DEFAULT)
public class UserDataSourceConfig extends DataSourceConfig{

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
