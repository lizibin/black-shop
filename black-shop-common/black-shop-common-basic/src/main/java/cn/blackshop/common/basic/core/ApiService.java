/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/ 
package cn.blackshop.common.basic.core;

import org.springframework.stereotype.Component;

import cn.blackshop.common.basic.constants.ApiConstants;
import lombok.Data;

/**
 * API 返回封装
 * @author zibin
 */
@Data
@Component
public class ApiService<T> {

	/**
	 * 返回错误的结果信息
	 */
	public ResponseResult<T> setResultError(String msg) {
		return setResult(ApiConstants.HTTP_RESULT_CODE_500, msg, null);
	}
	
	/**
	 * 返回错误码和错误的结果信息
	 */
	public ResponseResult<T> setResultError(Integer code, String msg) {
		return setResult(code, msg, null);
	}

	/**
	 * 返回成功
	 */
	public ResponseResult<T> setResultSuccess() {
		return setResult(ApiConstants.HTTP_RESULT_CODE_200, ApiConstants.HTTP_RESULT_CODE_200_VALUE, null);
	}
		
	/**
	 * 返回成功信息
	 */
	public ResponseResult<T> setResultSuccess(String msg) {
		return setResult(ApiConstants.HTTP_RESULT_CODE_200, msg, null);
	}
	
	/**
	 * 返回成功对象
	 */
	public ResponseResult<T> setResultSuccess(T data) {
		return setResult(ApiConstants.HTTP_RESULT_CODE_200, ApiConstants.HTTP_RESULT_CODE_200_VALUE, data);
	}

	/**
	 * 通用的封装
	 */
	public ResponseResult<T> setResult(Integer code, String msg, T data) {
		return new ResponseResult<T>(code, msg, data);
	}

}
