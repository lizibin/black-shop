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

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import com.alibaba.fastjson.JSON;

import cn.blackshop.service.user.security.dto.SecurityResponseBase;

/**  

* <p>Title: AjaxAccessDeniedHandler</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2019年1月18日  

*/
public class AjaxAccessDeniedHandler implements AccessDeniedHandler{
	@Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
		SecurityResponseBase responseBody = new SecurityResponseBase();

        responseBody.setCode(300);
        responseBody.setMessage("Need Authorities!");

        httpServletResponse.getWriter().write(JSON.toJSONString(responseBody));
    }
}
