package cn.blackshop.service.user.security.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

/**

* <p>Title: spring security认证成功handler</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2018年12月11日
 */
@Component
public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	public void onAuthenticationSuccess(HttpServletRequest req, HttpServletResponse res, Authentication arg2)
			throws IOException, ServletException {
		System.out.println("用户认证成功");
		res.sendRedirect("/");
	}

}
