/**
 * <p>Company: www.black-shop.cn</p>
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * @version 1.0
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.user.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体表
 * @author zibin
 */
@Data
@ToString
//@Table(name = "bs_user")
public class User implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 1668182610874748008L;

	/** 用户唯一的id */
	private Long id;

	/** 用户名 */
	private String userName;

	/** 用户手机号 */
	private String mobileNumber;

	/** 用户密码 */
	private String password;

	/** 用户是否被禁用 */
	private Boolean isEnabled;

	/** 用户修改时间 */
	private Date modifyTime;

	/** 用户最后登录时间 */
	private Date userLastTime;

	/** 用户注册ip */
	private String userRegIp;

	/** 用户最后登录ip */
	private String userLastIp;

	/** 用户头像 */
	private String portraitPic;

	/** 微信的openId */
	private String wechatOpenId;

	/** qq的openId */
	private String TecentOpenId;

}