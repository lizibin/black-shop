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
 * 分类表实体
 * @author zibin
 */
@Data
@ToString
@TableName("bs_category")
public class Category {

  /**
   * 主键id
   */
  private Long id;
  
  /**
   * 分类名称
   */
  private String categoryName;
  
  /**
   * 父类id
   */
  private Integer parentId;
  
  /**
   * 分类图标
   */
  private String icon;
  
  /**
   * 分类层级
   */
  private Integer level;
  
  /**
   * 创建时间
   */
  private Date createDate;
}
