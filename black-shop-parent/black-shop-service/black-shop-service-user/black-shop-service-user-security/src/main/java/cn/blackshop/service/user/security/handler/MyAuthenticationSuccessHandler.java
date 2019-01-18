package cn.blackshop.service.user.security.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

import cn.blackshop.service.user.security.dto.SecurityResponseBase;

/**

* <p>Title: spring security认证成功handler</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2018年12月11日
 */
@Component
public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler  {

	public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
		SecurityResponseBase responseBody = new SecurityResponseBase();

        responseBody.setRtnCode(200);
        responseBody.setMsg("Login Success!");

        httpServletResponse.getWriter().write(JSON.toJSONString(responseBody));
    }
}
