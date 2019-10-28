/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */

package cn.blackshop.goods.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 单品表实体
 * @author zibin
 */
@Data
@ToString
@TableName("bs_sku")
public class Sku {

	/**
	 * 主键id
	 */
	private Long id;

	/**
	 * 商品id
	 */
	private Integer productId;

	/**
	 * 中文属性值   key:value
	 */
	private String cnProperty;

	/**
	 * 属性值 key:value
	 */
	private String property;

	/**
	 * sku名字
	 */
	private String skuName;

	/**
	 * sku价格
	 */
	private BigDecimal skuPrice;

	/**
	 * sku库存
	 */
	private Integer stock;

	/**
	 * sku真实库存
	 */
	private Integer actualStock;

	/**
	 * sku主图
	 */
	private String pic;

	/**
	 * sku图片集合
	 */
	private String imageList;

	/**
	 * sku状态
	 */
	private Integer status;

	/**
	 * 创建时间
	 */
	private Date createDate;

}