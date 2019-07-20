/**

 * <p>Company: www.black-shop.cn</p>

 * <p>Copyright: Copyright (c) 2018</p>

 * black-shop(黑店) 版权所有,并保留所有权利。

 */


package cn.blackshop.common.data.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zibin
 */
@Configuration
@MapperScan("cn.blackshop.**.mapper")
public class MybatisPlusConfig {


}
