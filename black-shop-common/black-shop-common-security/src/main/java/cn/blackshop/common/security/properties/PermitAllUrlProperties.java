/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */

package cn.blackshop.common.security.properties;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 忽略的url配置
 */
@Data
public class PermitAllUrlProperties {


	private List<String> ignoreUrls = new ArrayList<>();



}
