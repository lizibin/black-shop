/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.model.product.entity;

import java.util.Date;

import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

/**
 *商品属性表实体，对应属性值一对多
 * @author zibin
 */
@Data
@ToString
@Table(name = "bs_product_property")
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
