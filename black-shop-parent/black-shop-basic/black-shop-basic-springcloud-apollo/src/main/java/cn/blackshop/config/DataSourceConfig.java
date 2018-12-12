package cn.blackshop.config;


import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Value;

/**
 * 数据源
 */
@EnableApolloConfig
public class DataSourceConfig {


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



}
