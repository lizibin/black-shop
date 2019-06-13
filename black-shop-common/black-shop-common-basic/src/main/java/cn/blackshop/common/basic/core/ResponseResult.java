/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/ 
package cn.blackshop.common.basic.core;

import cn.blackshop.common.basic.constants.HttpStatusConstants;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 返回值的结果
 * @author zibin
 */
@Data
@AllArgsConstructor
public class ResponseResult<T> {

	/** 状态码, 200: 代表成功, 其他值代表失败, -999: 代表未知错误 */
	private Integer status;

	/** 返回消息说明, sucess: 代表成功, fail: 代表失败 **/
	private String msg;
	/**
	 * 返回对象
	 */
	private T result;

	public ResponseResult() {
		super();
	}

	public ResponseResult(T result) {
		super();
		this.status = HttpStatusConstants.HTTP_RES_CODE_200;
		this.result = result;
	}

	public ResponseResult(T result, String msg) {
		super();
		this.result = result;
		this.msg = msg;
	}

	public ResponseResult(Throwable e) {
		super();
		this.msg = e.getMessage();
		this.status = HttpStatusConstants.HTTP_RES_CODE_500;
	}

	public boolean hasBody() {
		return this.result != null;
	}

}
