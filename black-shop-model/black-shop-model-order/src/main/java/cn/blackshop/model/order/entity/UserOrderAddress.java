/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.model.order.entity;

import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

/**
 * 用户底单表实体
 * @author zibin
 */
@Data
@ToString
@Table(name = "bs_user_order_address")
public class UserOrderAddress {

  /**
   * 主键id
   */
  private Long id;
  
  private Long userId;
  
  /**
   * 收货人姓名
   */
  private String consigneeName;
  
  /**
   * 手机号
   */
  private String mobileNumber;
  
  /**
   * 省份id
   */
  private Long provinceId;
  
  /**
   * 省份名称
   */
  private Long provinceName;
  
  /**
   * 城市id
   */
  private Long cityId;
  
  /**
   * 城市名称
   */
  private Long cityName;
  
  /**
   * 地区id
   */
  private Long areaId;
  
  /**
   * 地区名称
   */
  private Long areaName;
  
  /**
   * 详细地址
   */
  private String detailAddress;
}
