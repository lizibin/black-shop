/**  
 
* <p>Company: www.black-shop.cn</p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @version 1.0  
* black-shop(黑店) 版权所有,并保留所有权利。
*/  
package cn.blackshop.model.user.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**  
* <p>Title: User</p>  
* <p>Description: </p>  
* @author zibin  
* @date 2018年12月6日  
*/
@Data
@ToString
@Table(name = "bs_user")
public class User implements Serializable {
	
	/** serialVersionUID*/  
	private static final long serialVersionUID = 1668182610874748008L;

	/**用户唯一的id*/
	private Integer userId;
	
	/**用户昵称*/
	private String nickName;

	/**用户手机号*/
	private String mobile;

	/**用户密码*/
	private String password;

	/**用户是否被禁用*/
    private Boolean enabled;

    /**用户修改时间*/
    private Date modifyTime;

    /**用户最后登录时间*/
    private Date userLastTime;

    /**用户注册ip*/
    private String userRegIp;

    /**用户最后登录ip*/
    private String userLastIp;

    /**用户头像*/
    private String portraitPic;

    /**微信的openId*/
    private String openId;

}