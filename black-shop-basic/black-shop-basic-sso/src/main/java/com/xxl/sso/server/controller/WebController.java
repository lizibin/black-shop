package com.xxl.sso.server.controller;

import com.mayikt.base.BaseResponse;
import com.mayikt.constants.Constants;
import com.mayikt.member.input.dto.UserLoginInpDTO;
import com.mayikt.member.output.dto.UserOutDTO;
import com.mayikt.web.base.BaseWebController;
import com.netflix.discovery.converters.Auto;
import com.xxl.sso.core.conf.Conf;
import com.xxl.sso.core.login.SsoWebLoginHelper;
import com.xxl.sso.core.store.SsoLoginStore;
import com.xxl.sso.core.user.XxlSsoUser;
import com.xxl.sso.server.feign.MemberServiceFeign;
import com.xxl.sso.core.store.SsoSessionIdHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * sso server (for web)
 *
 * @author xuxueli 2017-08-01 21:39:47
 */
@Controller
public class WebController extends BaseWebController {
	@Autowired
	private MemberServiceFeign memberServiceFeign;

	@RequestMapping("/")
	public String index(Model model, HttpServletRequest request, HttpServletResponse response) {

		// login check
		XxlSsoUser xxlUser = SsoWebLoginHelper.loginCheck(request, response);

		if (xxlUser == null) {
			return "redirect:/login";
		} else {
			model.addAttribute("xxlUser", xxlUser);
			return "index";
		}
	}

	/**
	 * Login page
	 *
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(Conf.SSO_LOGIN)
	public String login(Model model, HttpServletRequest request, HttpServletResponse response) {

		// login check
		XxlSsoUser xxlUser = SsoWebLoginHelper.loginCheck(request, response);

		if (xxlUser != null) {

			// success redirect
			String redirectUrl = request.getParameter(Conf.REDIRECT_URL);
			if (redirectUrl != null && redirectUrl.trim().length() > 0) {

				String sessionId = SsoWebLoginHelper.getSessionIdByCookie(request);
				String redirectUrlFinal = redirectUrl + "?" + Conf.SSO_SESSIONID + "=" + sessionId;
				;

				return "redirect:" + redirectUrlFinal;
			} else {
				return "redirect:/";
			}
		}

		model.addAttribute("errorMsg", request.getParameter("errorMsg"));
		model.addAttribute(Conf.REDIRECT_URL, request.getParameter(Conf.REDIRECT_URL));
		return "login";
	}

	/**
	 * Login
	 *
	 * @param request
	 * @param redirectAttributes
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping("/doLogin")
	public String doLogin(HttpServletRequest request, HttpServletResponse response,
			RedirectAttributes redirectAttributes, String username, String password, String ifRemember) {

		boolean ifRem = (ifRemember != null && "on".equals(ifRemember)) ? true : false;

		// valid login 调用会员服务进行验证
		// ReturnT<UserInfo> result = userService.findUser(username, password);
		// if (result.getCode() != ReturnT.SUCCESS_CODE) {
		// redirectAttributes.addAttribute("errorMsg", result.getMsg());
		//
		// redirectAttributes.addAttribute(Conf.REDIRECT_URL,
		// request.getParameter(Conf.REDIRECT_URL));
		// return "redirect:/login";
		// }
		// >>>>>>>认证授权中心调用会员服务接口进行验证
		UserLoginInpDTO userLoginInpDTO = new UserLoginInpDTO();
		userLoginInpDTO.setLoginType(Constants.MEMBER_LOGIN_TYPE_PC);
		userLoginInpDTO.setMobile(username);
		userLoginInpDTO.setPassword(password);
		String info = webBrowserInfo(request);
		userLoginInpDTO.setDeviceInfor(info);
		BaseResponse<UserOutDTO> ssoLogin = memberServiceFeign.ssoLogin(userLoginInpDTO);
		if (!isSuccess(ssoLogin)) {
			redirectAttributes.addAttribute("errorMsg", ssoLogin.getMsg());
			redirectAttributes.addAttribute(Conf.REDIRECT_URL, request.getParameter(Conf.REDIRECT_URL));
			return "redirect:/login";
		}
		UserOutDTO data = ssoLogin.getData();
		if (data == null) {
			redirectAttributes.addAttribute("errorMsg", "没有获取用户信息");
			redirectAttributes.addAttribute(Conf.REDIRECT_URL, request.getParameter(Conf.REDIRECT_URL));
			return "redirect:/login";
		}
		XxlSsoUser xxlUser = new XxlSsoUser();
		xxlUser.setUserid(String.valueOf(data.getUserId()));
		xxlUser.setUsername(data.getUserName());
		xxlUser.setVersion(UUID.randomUUID().toString().replaceAll("-", ""));
		xxlUser.setExpireMinite(SsoLoginStore.getRedisExpireMinite());
		xxlUser.setExpireFreshTime(System.currentTimeMillis());

		// 2、make session id
		String sessionId = SsoSessionIdHelper.makeSessionId(xxlUser);

		// 3、login, store storeKey + cookie sessionId
		SsoWebLoginHelper.login(response, sessionId, xxlUser, ifRem);

		// 4、return, redirect sessionId
		String redirectUrl = request.getParameter(Conf.REDIRECT_URL);
		if (redirectUrl != null && redirectUrl.trim().length() > 0) {
			String redirectUrlFinal = redirectUrl + "?" + Conf.SSO_SESSIONID + "=" + sessionId;
			return "redirect:" + redirectUrlFinal;
		} else {
			return "redirect:/";
		}

	}

	/**
	 * Logout
	 *
	 * @param request
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(Conf.SSO_LOGOUT)
	public String logout(HttpServletRequest request, HttpServletResponse response,
			RedirectAttributes redirectAttributes) {

		// logout
		SsoWebLoginHelper.logout(request, response);

		redirectAttributes.addAttribute(Conf.REDIRECT_URL, request.getParameter(Conf.REDIRECT_URL));
		return "redirect:/login";
	}

}