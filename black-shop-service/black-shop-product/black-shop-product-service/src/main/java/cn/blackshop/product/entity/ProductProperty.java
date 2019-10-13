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
 *商品属性表实体，对应属性值一对多
 * @author zibin
 */
@Data
@ToString
@TableName("bs_product_property")
public class ProductProperty {

  /**
   * 主键id
   */
  private Long id;
  
  /**
   * 属性的名称
   */
  private String propertyName;
  
  /**
   * 创建时间
   */
  private Date createDate;
  
}
