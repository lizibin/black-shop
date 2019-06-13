/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.portal.web.controller;

import cn.blackshop.common.web.base.BaseWebController;
import cn.blackshop.user.api.client.UserServiceClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 首页的控制器
 * @author zibin
 */
@Controller
@AllArgsConstructor
public class IndexController extends BaseWebController {

	private static final String INDEX_FTL = "index";

	private final UserServiceClient userServiceClient;

	/**
	 * Index.
	 */
	@RequestMapping("/")
	public String index(HttpServletRequest request, HttpServletResponse response, Model model) {
		System.out.println("index页面访问");
		return INDEX_FTL;
	}
}
