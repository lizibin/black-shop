/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018-2050</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.basic.gateway.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

/**
 * 聚合接口文档注册
 * @author zibin
 */
@Component
@Primary
@AllArgsConstructor
public class SwaggerProvider implements SwaggerResourcesProvider{
  /** The Constant API_URI. */
  private static final String API_URI = "/v2/api-docs";

  @Override
  public List<SwaggerResource> get() {
    List<SwaggerResource> resources = new ArrayList<>();
    resources.add(swaggerResource("用户服务", "/user" + API_URI));
    resources.add(swaggerResource("商品服务", "/product" + API_URI));
    resources.add(swaggerResource("搜索服务", "/portal" + API_URI));
    resources.add(swaggerResource("购物车服务", "/cart" + API_URI));
    resources.add(swaggerResource("订单服务", "/order" + API_URI));
    resources.add(swaggerResource("支付服务", "/portal" + API_URI));
    return resources;

  }

  /**
   * Swagger resource.
   *
   * @param name     the name
   * @param location the location
   * @return the swagger resource
   */
  private SwaggerResource swaggerResource(String name, String location) {
    SwaggerResource swaggerResource = new SwaggerResource();
    swaggerResource.setName(name);
    swaggerResource.setLocation(location);
    swaggerResource.setSwaggerVersion("2.0");
    return swaggerResource;
  }
}
