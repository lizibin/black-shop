/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.model.shoppingcart.entity;

import java.util.Date;

import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

/**
 * 购物车表实体
 * @author zibin
 */
@Data
@ToString
@Table(name = "bs_shopping_cart")
public class ShoppingCart {

  /**
   * 主键id
   */
  private Long id;
  
  /**
   * 用户id
   */
  private Long userId;

  /**
   * 商品id
   */
  private Long productId;
  
  /**
   * skuId
   */
  private Long skuId;
  
  /**
   * 数量
   */
  private Long count;
  
  /**
   * 添加购物车时间
   */
  private Date addDate;
  
  /**
   * 当前选中状态
   */
  private Integer selectedStatus;
}
