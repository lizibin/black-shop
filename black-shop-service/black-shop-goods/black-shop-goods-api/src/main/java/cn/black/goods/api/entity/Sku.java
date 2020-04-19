/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */

package cn.black.goods.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 单品实体
 * @author zibin
 */
@Data
public class Sku {

	/**
	 * 主键id
	 */
	@TableId(value = "sku_id", type = IdType.AUTO)
	private Long skuId;

	/**
	 * 商品id
	 */
	private Integer goodsId;


	/**
	 * sku名字
	 */
	private String name;

	/**
	 * sku价格
	 */
	private BigDecimal price;

	/**
	 * sku库存
	 */
	private Integer stock;

	/**
	 * sku状态
	 */
	private Integer status;

}