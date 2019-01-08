package cn.blackshop.basic.apollo.config;


import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Value;

/**
 * 数据源
 */
@EnableApolloConfig
public abstract class DataSourceConfig {


    @Value("${driverClassName}")
    protected String driverClassName;

    @Value("${sys_user_driverUrl}")
    protected String userDriverUrl;

    @Value("${username}")
    protected String userName;

    @Value("${passWord}")
    protected String passWord;

    @Value("${connectionProperties}")
    protected String connectionProperties;

    @Value("${datasource_initialSize}")
    protected Integer initialSize;

    @Value("${datasource_minIdle}")
    protected Integer minIdle;

    @Value("${datasource_maxActive}")
    protected Integer maxActive;

    @Value("${datasource_maxWait}")
    protected Long maxWait;

    @Value("${datasource_timeBetweenEvictionRunsMillis}")
    protected Long timeBetweenEvictionRunsMillis;

    @Value("${datasource_minEvictableIdleTimeMillis}")
    protected Long minEvictableIdleTimeMillis;

    @Value("${datasource_validationQuery}")
    protected String validationQuery;

    @Value("${datasource_testWhileIdle}")
    protected boolean testWhileIdle;

    @Value("${datasource_testOnBorrow}")
    protected boolean testOnBorrow;

    @Value("${datasource_testOnReturn}")
    protected boolean testOnReturn;

    @Value("${datasource_poolPreparedStatements}")
    protected boolean poolPreparedStatements;

    @Value("${maxPoolPreparedStatementPerConnectionSize}")
    protected Integer maxPoolPreparedStatementPerConnectionSize;

    @Value("${datasource_filters}")
    protected String filters;

    @Value("${datasource_useGlobalDataSourceStat}")
    protected boolean useGlobalDataSourceStat;

}
