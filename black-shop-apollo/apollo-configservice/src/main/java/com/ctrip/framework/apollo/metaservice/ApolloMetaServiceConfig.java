package com.ctrip.framework.apollo.metaservice;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackageClasses = ApolloMetaServiceConfig.class)
public class ApolloMetaServiceConfig {

}
