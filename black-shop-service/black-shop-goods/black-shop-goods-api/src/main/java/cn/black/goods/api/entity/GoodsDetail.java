/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */

package cn.black.goods.api.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.ToString;


/**
 * 商品表实体
 * @author zibin
 */
@Data
@ToString
public class GoodsDetail {

	/**
	 * 主键id
	 */
	private Long id;


	private Long goodsId;

	@TableField("product_content")
	private Long productContent;
}