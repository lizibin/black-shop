package cn.blackshop.service.user.security.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

import cn.blackshop.service.user.security.dto.SecurityResponseBase;

/**

* <p>Title: spring security认证失败handler</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2018年12月11日
 */
@Component
public class MyAuthenticationFailureHandler implements AuthenticationFailureHandler {

	  @Override
	    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
		  	SecurityResponseBase responseBody = new SecurityResponseBase();

	        responseBody.setRtnCode(400);
	        responseBody.setMsg("Login Failure!");

	        httpServletResponse.getWriter().write(JSON.toJSONString(responseBody));
	    }
}
