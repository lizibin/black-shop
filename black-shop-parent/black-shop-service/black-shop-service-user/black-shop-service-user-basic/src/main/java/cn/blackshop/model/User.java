/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**  

* <p>Title: User</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2018年12月6日  

*/
@Data
@ToString
public class User {
	
	private Integer userId;
	
	private String nickName;

	private String mobile;

	private String password;

    private Boolean enabled;

    private Date modifyTime;

    private Date userLastTime;

    private String userRegIp;

    private String userLastIp;

    private String portraitPic;

    private String openId;

}
