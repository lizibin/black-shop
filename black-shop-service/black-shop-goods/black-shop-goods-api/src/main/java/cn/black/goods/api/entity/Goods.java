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
import java.util.Date;

/**
 * 商品实体
 * @author zibin
 */
@Data
public class Goods {

	/**
	 * 商品id
	 */
	@TableId(value = "goods_id", type = IdType.AUTO)
	private Long goodsId;

	/**
	 * 分类id
	 */
	private Long category_id;

	/**
	 * 品牌id
	 */
	private Long brand_id;

	/**
	 * 商品名称
	 */
	private String name;

	/**
	 * 商品图片(主图)
	 */
	private String image;

	/**
	 * 商品简要、卖点
	 */
	private String brief;

	/**
	 * 商品价格
	 */
	private BigDecimal price;

	/**
	 * 商品原价
	 */
	private BigDecimal originalPrice;

	/**
	 * 商品库存
	 */
	private Long stock;

	/**
	 * 商品状态
	 */
	private Long status;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 创建时间
	 */
	private Date updateTime;
}