/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/ 
package cn.blackshop.common.basic.core;

import lombok.Data;

/**
 * 返回值的结果
 * @author zibin
 */
@Data
public class ResponseResult<T> {

	/**
	 * 返回状态码
	 */
	private Integer code;
	/**
	 * 返回消息
	 */
	private String message;
	/**
	 * 返回对象
	 */
	private T data;

	public ResponseResult() {

	}

	public ResponseResult(Integer code, String message, T data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponseBase [code=" + code + ", message=" + message + ", data=" + data + "]";
	}

}
