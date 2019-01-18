/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.service.user.security.entrypoint;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import com.alibaba.fastjson.JSON;

import cn.blackshop.service.user.security.dto.SecurityResponseBase;

/**  

* <p>Title: AjaxAuthenticationEntryPoint</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2019年1月18日  

*/
public class AjaxAuthenticationEntryPoint  implements AuthenticationEntryPoint {
	 @Override
	    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
		 SecurityResponseBase responseBody = new SecurityResponseBase();

	        responseBody.setRtnCode(000);
	        responseBody.setMsg("Need Authorities!");

	        httpServletResponse.getWriter().write(JSON.toJSONString(responseBody));
	    }
}
