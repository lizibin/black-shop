package cn.blackshop.common.basic.base;

import org.springframework.stereotype.Component;

import cn.blackshop.common.basic.constants.ApiConstants;

@Component
public class BaseApiService {

	public ResponseBase setResultError(Integer code, String msg) {
		return setResult(code, msg, null);
	}

	// 返回错误，可以传msg
	public ResponseBase setResultError(String msg) {
		return setResult(ApiConstants.HTTP_RES_CODE_500, msg, null);
	}

	// 返回成功，可以传data值
	public ResponseBase setResultSuccess(Object data) {
		return setResult(ApiConstants.HTTP_RES_CODE_200, ApiConstants.HTTP_RES_CODE_200_VALUE, data);
	}

	// 返回成功，沒有data值
	public ResponseBase setResultSuccess() {
		return setResult(ApiConstants.HTTP_RES_CODE_200, ApiConstants.HTTP_RES_CODE_200_VALUE, null);
	}

	// 返回成功，沒有data值
	public ResponseBase setResultSuccess(String msg) {
		return setResult(ApiConstants.HTTP_RES_CODE_200, msg, null);
	}

	// 通用封装
	public ResponseBase setResult(Integer code, String msg, Object data) {
		return new ResponseBase(code, msg, data);
	}

}
