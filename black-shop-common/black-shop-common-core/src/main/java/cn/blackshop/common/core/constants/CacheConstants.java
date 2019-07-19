package cn.blackshop.common.core.constants;

/**
 * @author zibin
 * @date 2019-04-28
 * <p>
 * 缓存的key 常量
 */
public interface CacheConstants {

	/**
	 * 菜单信息缓存
	 */
	String MENU_DETAILS = "menu_details";

	/**
	 * 用户信息缓存
	 */
	String USER_DETAILS = "user_details";

	/**
	 * 字典信息缓存
	 */
	String DICT_DETAILS = "dict_details";


	/**
	 * oauth 客户端信息
	 */
	String CLIENT_DETAILS_KEY = "blackshop_oauth:client:details";


	/**
	 * spring boot admin 事件key
	 */
	String EVENT_KEY = "event_key";

	/**
	 * 路由存放
	 */
	String ROUTE_KEY = "gateway_route_key";

	/**
	 * 参数缓存
	 */
	String PARAMS_DETAILS = "params_details";
}
