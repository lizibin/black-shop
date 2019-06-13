/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.user.api.dto.e;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * UserEnterDTO 用户入参的DTO.
 * @author zibin
 */

@Data
@ToString
@ApiModel(value = "用户信息实体类")
public class UserEnterDTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2708848879471364900L;

	/** 用户手机号. */
	@ApiModelProperty(value = "用户手机号")
	private String mobileNumber;
	
	/** 用户密码. */
    @ApiModelProperty(value = "用户密码")
	private String password;

}