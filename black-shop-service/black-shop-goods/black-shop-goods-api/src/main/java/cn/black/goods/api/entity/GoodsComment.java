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


/**
 * 商品评论实体
 * @author zibin
 */
@Data
public class GoodsComment {

	/**
	 * 商品详情id
	 */
	@TableId(value = "common_id", type = IdType.AUTO)
	private Long commonId;

	/**
	 * 商品id
	 */
	private Long goodsId;

	/**
	 * skuid
	 */
	private Long skuId;

	/**
	 * 用户id
	 */
	private Long userId;

	/**
	 * 用户名
	 */
	private Long userName;;

	/**
	 * 是否匿名(0,1 匿名)
	 */
	private Boolean is_anonymous;

	/**
	 * 创建时间
	 */
	private Boolean createTime;

}