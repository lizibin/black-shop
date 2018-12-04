package com.ctrip.framework.apollo.portal.spi.configuration;

import com.ctrip.framework.apollo.portal.service.RoleInitializationService;
import com.ctrip.framework.apollo.portal.service.RolePermissionService;
import com.ctrip.framework.apollo.portal.spi.defaultimpl.DefaultRoleInitializationService;
import com.ctrip.framework.apollo.portal.spi.defaultimpl.DefaultRolePermissionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Timothy Liu(timothy.liu@cvte.com)
 */
@Configuration
public class RoleConfiguration {
    @Bean
    public RoleInitializationService roleInitializationService() {
        return new DefaultRoleInitializationService();
    }

    @Bean
    public RolePermissionService rolePermissionService() {
        return new DefaultRolePermissionService();
    }
}
