/**  
 
* <p>Company: www.black-shop.cn</p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @version 1.0  
* black-shop(黑店) 版权所有,并保留所有权利。
*/
package cn.blackshop.model.user.entity;

import java.util.Date;

import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

/**
 * 用户登录token实体表
 * @author zibin
 */
@Data
@ToString
@Table(name = "bs_user_token")
public class UserToken{


  /** 用户唯一的id */
  private Long id;
  
  /**
   * 用户id
   */
  private Long userId;

  /**
   * 用户生成的token
   */
  private String token;
  
  /**
   * 登录的类型
   */
  private String loginType;
  
  /**
   * 设备信息
   */
  private String deviceInfo;
  
  /**
   * 是否可用
   */
  private Boolean isEnabled;
  
  /**
   * token创建时间
   */
  private Date createDate;
  
}