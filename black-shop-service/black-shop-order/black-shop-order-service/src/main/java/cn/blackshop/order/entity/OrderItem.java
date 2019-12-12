/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */

package cn.blackshop.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * 订单项表实体
 * @author zibin
 */
@Data
@ToString
@TableName("bs_order_item")
public class OrderItem {

	/**
	 * 主键id
	 */
	private Long id;

	/**
	 * 订单交易号
	 */
	private String order_serial_number;

	/**
	 * 订单项流水号
	 */
	private String order_item_seria_number;

	/**
	 * 商品id
	 */
	private Long productId;

	/**
	 * skuId
	 */
	private Long skuId;

	/**
	 * 商品的名称、也许是sku的名称
	 */
	private String productName;
	/**
	 * 购买该订单项的数量
	 */
	private Integer count;

	/**
	 * 商品动态属性
	 */
	private String dynamicProperty;

	/**
	 * 商品的主图、也许是sku的主图
	 */
	private String pic;

	/**
	 * 商品的价格(单品)
	 */
	private BigDecimal price;

	/**
	 * 商品的总价格(单品*数量)
	 */
	private BigDecimal totalPrice;
}
