/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */

package cn.blackshop.shoppingcart.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 购物车表实体
 * @author zibin
 */
@Data
@ToString
@TableName("bs_shopping_cart")
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
