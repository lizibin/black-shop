/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import static com.alibaba.nacos.console.config.PropertyConfig.STANDALONE_MODEL;
import static com.alibaba.nacos.console.config.PropertyConfig.TOMCAT_ACCESS_LOG;

/**
 * @author nacos
 * @author zibin
 * nacos源码
 *
 */
@SpringBootApplication(scanBasePackages = "com.alibaba.nacos")
@EnableScheduling
public class BlackNacosApplication {

    public static void main(String[] args) {
		System.setProperty(STANDALONE_MODEL, "true");
		System.setProperty(TOMCAT_ACCESS_LOG, "false");
    	SpringApplication.run(BlackNacosApplication.class, args);
    }
}
