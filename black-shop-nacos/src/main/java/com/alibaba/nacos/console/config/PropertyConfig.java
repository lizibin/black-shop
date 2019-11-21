package com.alibaba.nacos.console.config;


/**
 * 配置启动文件
 * @author zibin
 */
public interface PropertyConfig {

	/**
	 * 单机模式
	 * 否则会加载集群文件
	 */
	String STANDALONE_MODEL="nacos.standalone";


}
