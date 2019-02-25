/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.model.order.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

/**
 * 订单表实体
 * @author zibin
 */
@Data
@ToString
@Table(name = "bs_order")
public class Order {

  /**
   * 主键id
   */
  private Long id;
  
  /**
   * 订单流水号
   */
  private String orderSerialNumber;
  
  /**
   * 用户id
   */
  private Long userId;
  
  /**
   * 用户名称
   */
  private String userName;
  
  /**
   * 商品名称(冗余)
   */
  private String productName;
  
  /**
   * 购买下单时间
   */
  private Date buyDate;
  
  /**
   * 总价格
   */
  private BigDecimal totalPrice;
  
  /**
   * 实际总价格
   */
  private BigDecimal actualTotalPrice;
  
  /**
   * 订单运费
   */
  private BigDecimal freightPrice;
  
  /**
   * 是否已经支付
   */
  private Boolean isPayed;
  
  /**
   * 支付类型id
   */
  private Long payTypeId;
  
  /**
   * 支付类型名称
   */
  private String payTypeName;
  
  /**
   * 支付时间
   */
  private Date payDate;
  
  /**
   * 支付流水号
   */
  private String paySerialNumber;
  
  /**
   * 订单结算单据号
   */
  private String orderSettlementNumber;
  
  /**
   * 订单状态
   */
  private Integer status;
  
  /**
   * 发货时间
   */
  private Date DeliveryDate;
  
  /**
   * 物流单号
   */
  private String logisticalNumber;
  
  /**
   * 订单留言备注
   */
  private String orderRemark;
  
  /**
   * 用户订单收货地址
   */
  private Integer userOrderAddrId;
  
  /**
   * 订单完成时间
   */
  private Date completeDate;
  
  /**
   * 订单取消原因
   */
  private String cancelReason;
}
