package cn.blackshop.service.thirdpart.wechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.spring4all.swagger.EnableSwagger2Doc;

/**
 * 启动类
 * 
 * @author zibin
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2Doc
@EnableFeignClients
public class WechetApp {

  public static void main(String[] args) {
    SpringApplication.run(WechetApp.class, args);
  }
}
