/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.user.api.dto.o;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * UserOutDTO 用户返回的参数DTO
 * @author zibin
 */
@Data
@ToString
public class UserOutDTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2708848879471364900L;

	/** 用户唯一的id. */
	private Integer userId;
	
	/** 用户昵称. */
	private String nickName;

	/** 用户手机号. */
	private String mobile;

    /** 用户头像. */
    private String portraitPic;

}