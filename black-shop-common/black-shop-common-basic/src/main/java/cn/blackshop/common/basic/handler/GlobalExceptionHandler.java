/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.common.basic.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import cn.blackshop.common.basic.core.ApiService;
import cn.blackshop.common.basic.core.ResponseResult;
import lombok.extern.slf4j.Slf4j;


/**
 * 全局异常捕获
 * @author zibin
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends ApiService<JSONObject> {
	
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public ResponseResult<JSONObject> exceptionHandler(Exception e) {
		log.info("全局异常捕获,error:{}", e);
		return setResultError("系统发生错误，请及时调整");
	}
}
