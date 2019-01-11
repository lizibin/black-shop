/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.service.user.basic.config;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.druid.pool.DruidDataSource;

import lombok.extern.slf4j.Slf4j;

/**  

* <p>Title: DataSourceManager</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2019年1月11日  

*/
@Component
@Slf4j
public class DataSourceManager {

	@Autowired
	private UserDataSourceConfig userDataSourceConfig;


	/**
	 * 初始化创建数据源
	 * @throws SQLException 
	 */
	public DruidDataSource createDataSource() throws SQLException {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(userDataSourceConfig.getDriverClassName());
		/*dataSource.setDbType(dataSourceConfig.getType());*/
		dataSource.setUrl(userDataSourceConfig.getUrl());
		dataSource.setUsername(userDataSourceConfig.getUserName());
		dataSource.setPassword(userDataSourceConfig.getPassWord());
		dataSource.setInitialSize(userDataSourceConfig.getInitialSize());
        dataSource.setMinIdle(userDataSourceConfig.getMinIdle());
        dataSource.setMaxActive(userDataSourceConfig.getMaxActive());
        dataSource.setMaxWait(userDataSourceConfig.getMaxWait());
        dataSource.setTimeBetweenEvictionRunsMillis(userDataSourceConfig.getTimeBetweenEvictionRunsMillis());
        dataSource.setMinEvictableIdleTimeMillis(userDataSourceConfig.getMinEvictableIdleTimeMillis());
        dataSource.setTestWhileIdle(userDataSourceConfig.isTestWhileIdle());
        dataSource.setTestOnBorrow(userDataSourceConfig.isTestOnBorrow());
        dataSource.setTestOnReturn(userDataSourceConfig.isTestOnReturn());
        dataSource.setPoolPreparedStatements(userDataSourceConfig.isPoolPreparedStatements());
        dataSource.setMaxOpenPreparedStatements(userDataSourceConfig.getMaxPoolPreparedStatementPerConnectionSize());
        if(null != userDataSourceConfig.getMaxPoolPreparedStatementPerConnectionSize()){
            dataSource.setMaxPoolPreparedStatementPerConnectionSize(userDataSourceConfig.getMaxPoolPreparedStatementPerConnectionSize());
        }
        dataSource.setFilters(userDataSourceConfig.getFilters());
		
		String connectionProperties = userDataSourceConfig.getConnectionProperties();
		if(connectionProperties != null && !"".equals(connectionProperties)){
			Properties connectProperties = new Properties();
			String[] propertiesList = connectionProperties.split(";");
			for(String propertiesTmp:propertiesList){
				String[] obj = propertiesTmp.split("=");
				String key = obj[0];
				String value = obj[1];
				connectProperties.put(key,value);
			}
			dataSource.setConnectProperties(connectProperties);
		}
		return dataSource;
	}

	public DruidDataSource createAndTestDataSource() throws SQLException {
		DruidDataSource newDataSource = createDataSource();
		try {
			testConnection(newDataSource);
		} catch (SQLException ex) {
			log.error("Testing connection for data source failed: {}", newDataSource.getRawJdbcUrl(), ex);
			newDataSource.close();
			throw ex;
		}

		return newDataSource;
	}

	private void testConnection(DataSource dataSource) throws SQLException {
		//borrow a connection
		Connection connection = dataSource.getConnection();
		//return the connection
		connection.close();
	}
}
