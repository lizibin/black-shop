/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.common.security.annotation;

import cn.blackshop.common.security.component.BlackResourceServerAutoConfiguration;
import cn.blackshop.common.security.component.SecurityBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import java.lang.annotation.*;

/**
 * 开启资源服务器鉴权
 * @author zibin
 */
@Documented
@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableResourceServer
@Import({BlackResourceServerAutoConfiguration.class,SecurityBeanDefinitionRegistrar.class})
public @interface EnableBlackResourceServer {

}
