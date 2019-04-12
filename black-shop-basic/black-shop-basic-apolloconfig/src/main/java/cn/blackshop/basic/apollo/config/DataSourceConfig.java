/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.basic.apollo.config;

import org.springframework.beans.factory.annotation.Value;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

import cn.blackshop.basic.apollo.constans.ApolloNamespaceConstant;
import lombok.Data;

/**  
* <p>Description: 加载apollo 公共命名空间的DataSource数据源</p>  
* @author zibin  
*/
@Data
@EnableApolloConfig(ApolloNamespaceConstant.PUBLIC_DATASOURCE_CONFIG)
public class DataSourceConfig {
	@Value("${spring.datasource.driver-class-name}") 
	private String driverClassName;
	
	@Value("${spring.datasource.type}") 
	private String  type;

    @Value("${spring.datasource.connectionProperties}")
    private String connectionProperties;
    
    @Value("${spring.datasource.druid.max-active}")
    private Integer maxActive;
    
    @Value("${spring.datasource.druid.initial-size}")
    private Integer initialSize;
    
    @Value("${spring.datasource.druid.max-wait}")
    private Long maxWait;

    @Value("${spring.datasource.druid.min-idle}")
    private Integer minIdle;

    @Value("${spring.datasource.druid.time-between-eviction-runs-millis}")
    private Long timeBetweenEvictionRunsMillis;

    @Value("${spring.datasource.druid.min-evictable-idle-time-millis}")
    private Long minEvictableIdleTimeMillis;
    
    @Value("${spring.datasource.druid.test-while-idle}")
    private boolean testWhileIdle;

    @Value("${spring.datasource.druid.test-on-borrow}")
    private boolean testOnBorrow;

    @Value("${spring.datasource.druid.test-on-return}")
    private boolean testOnReturn;

    @Value("${spring.datasource.druid.pool-prepared-statements}")
    private boolean poolPreparedStatements;
    
    @Value("${spring.datasource.druid.max-open-prepared-statements}")
    private Integer maxOpenPreparedStatements;

    @Value("${spring.datasource.druid.max-pool-prepared-statement-per-connection-size}")
    private Integer maxPoolPreparedStatementPerConnectionSize;

    @Value("${spring.datasource.druid.filters}")
    private String filters;
}
