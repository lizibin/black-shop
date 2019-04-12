/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018-2050</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.basic.gateway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.http.codec.support.DefaultServerCodecConfigurer;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.cors.reactive.CorsUtils;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;

import reactor.core.publisher.Mono;

/**
 * @author zibin
 *
 */
@Configuration
public class CorsConfig {

  private static final String MAX_AGE = "18000L";

  @Bean
  public WebFilter corsFilter() {
    return (ServerWebExchange ctx, WebFilterChain chain) -> {
      ServerHttpRequest request = ctx.getRequest();
      if (CorsUtils.isCorsRequest(request)) {
        HttpHeaders requestHeaders = request.getHeaders();
        ServerHttpResponse response = ctx.getResponse();
        HttpMethod requestMethod = requestHeaders.getAccessControlRequestMethod();
        HttpHeaders headers = response.getHeaders();
        headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, requestHeaders.getOrigin());
        headers.addAll(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS, requestHeaders.getAccessControlRequestHeaders());
        if (requestMethod != null) {
          headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS, requestMethod.name());
        }
        headers.add(HttpHeaders.ACCESS_CONTROL_ALLOW_CREDENTIALS, "true");
        headers.add(HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS, "*");
        headers.add(HttpHeaders.ACCESS_CONTROL_MAX_AGE, MAX_AGE);
        if (request.getMethod() == HttpMethod.OPTIONS) {
          response.setStatusCode(HttpStatus.OK);
          return Mono.empty();
        }

      }
      return chain.filter(ctx);
    };
  }

  /**
   * Server codec configurer.
   *
   * @return the server codec configurer
   */
  @Bean
  public ServerCodecConfigurer serverCodecConfigurer() {
    return new DefaultServerCodecConfigurer();
  }

  /**
   * 如果使用了注册中心（如：Eureka），进行控制则需要增加如下配置.
   *
   * @param discoveryClient the discovery client
   * @param properties      the properties
   * @return the route definition locator
   */
  @Bean
  public RouteDefinitionLocator discoveryClientRouteDefinitionLocator(DiscoveryClient discoveryClient,
      DiscoveryLocatorProperties properties) {
    return new DiscoveryClientRouteDefinitionLocator(discoveryClient, properties);
  }

}
