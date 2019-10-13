/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */

package cn.blackshop.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 *商品属性值表实体
 * @author zibin
 */
@Data
@ToString
@TableName("bs_product_property_value")
public class ProductPropertyValue {

  /**
   * 主键id
   */
  private Long id;
  
  /**
   * 属性id
   */
  private Long propertyId;
  
  /**
   * 属性名称
   */
  private String propertyName;
  
  /**
   * 创建时间
   */
  private Date createDate;
  
}
