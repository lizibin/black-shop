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
 * 品牌表实体
 * @author zibin
 */
@Data
@ToString
@Table(name = "bs_brand")
public class Brand {

  /**
   * 主键id
   */
  private Long id;
  
  /**
   * 品牌名字
   */
  private String brandName;
  
  /**
   * 品牌图片路径
   */
  private String brandPic;
  
  /**
   * 品牌备注
   */
  private String remark;
  
  /**
   * 品牌状态
   */
  private Integer status;
  
  /**
   * 创建时间
   */
  private Date createDate;
}
