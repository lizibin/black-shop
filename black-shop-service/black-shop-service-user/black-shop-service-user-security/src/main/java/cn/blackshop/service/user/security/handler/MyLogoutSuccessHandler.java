/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.service.user.security.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import com.alibaba.fastjson.JSON;

import cn.blackshop.service.user.security.dto.SecurityResponseBase;

/**  

* <p>Title: MyLogoutSuccessHandler</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2019年1月18日  

*/
public class MyLogoutSuccessHandler implements LogoutSuccessHandler{

	 @Override
	    public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
		 	SecurityResponseBase responseBody = new SecurityResponseBase();

	        responseBody.setRtnCode(100);
	        responseBody.setMsg("Logout Success!");

	        httpServletResponse.getWriter().write(JSON.toJSONString(responseBody));
	    }
}
