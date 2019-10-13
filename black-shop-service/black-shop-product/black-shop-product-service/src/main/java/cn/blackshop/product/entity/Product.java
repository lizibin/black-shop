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

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品表实体
 * @author zibin
 */
@Data
@ToString
@TableName("bs_product")
public class Product {

  /**
   * 主键id
   */
  private Long id;
  
  /**
   * 一级分类id
   */
  private Long firstCategoryId;
  
  /**
   * 二级分类id
   */
  private Long secondCategoryId;
  
  /**
   * 三级分类id
   */
  private Long thirdCategoryId;
  
  /**
   * 商品名称
   */
  private String productName;
  
  /**
   * 商品价格
   */
  private BigDecimal productPrice;
  
  /**
   * 商品简要、卖点
   */
  private String brief;
  
  /**
   * 商品主图
   */
  private String pic;
  
  /**
   * 商品图片集合
   */
  private String imageList;
  
  /**
   * 商品状态
   */
  private Integer status;
  
  /**
   * 商品库存，包含所有sku的库存
   */
  private Integer totalStock;
  
  /**
   * 商品动态参数
   */
  private String dynamicParameter;
  
  /**
   * 商品品牌id
   */
  private Long brandId;
  
  /**
   * 商品详细内容
   */
  private String content;
  
  /**
   * 创建时间
   */
  private Date createDate;
  
}
