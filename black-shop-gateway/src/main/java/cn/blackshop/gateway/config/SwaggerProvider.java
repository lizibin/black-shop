/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.gateway.config;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.cloud.gateway.config.GatewayProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.support.NameUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

/**
 * 聚合接口文档注册
 *
 * @author zibin
 */
@Component
@Primary
@AllArgsConstructor
public class SwaggerProvider implements SwaggerResourcesProvider {

	public static final String API_URI = "/v2/api-docs";
	private final RouteLocator routeLocator;
	private final GatewayProperties gatewayProperties;

	/**
	 * 根据网关路由返回对应服务swagger文档
	 */
	@Override
	public List<SwaggerResource> get() {
		List<SwaggerResource> resources = new ArrayList<>();
		List<String> routes = new ArrayList<>();
		//取出gateway的route
		routeLocator.getRoutes().subscribe(route -> routes.add(route.getId()));
		//结合配置的route-路径(Path)，和route过滤，只获取有效的route节点
		gatewayProperties.getRoutes().stream()
				.filter(routeDefinition -> routes.contains(routeDefinition.getId()))
				.forEach(routeDefinition -> routeDefinition.getPredicates().stream()
						.filter(predicateDefinition -> ("Path")
								.equalsIgnoreCase(predicateDefinition.getName()))
						.forEach(predicateDefinition -> resources
								.add(swaggerResource(routeDefinition.getId(),
										predicateDefinition.getArgs()
												.get(NameUtils.GENERATED_NAME_PREFIX + "0")
												.replace("/**", API_URI)))));
		return resources;
	}

	private SwaggerResource swaggerResource(String name, String location) {
		SwaggerResource swaggerResource = new SwaggerResource();
		swaggerResource.setName(name);
		swaggerResource.setLocation(location);
		swaggerResource.setSwaggerVersion("2.0");
		return swaggerResource;
	}
}
