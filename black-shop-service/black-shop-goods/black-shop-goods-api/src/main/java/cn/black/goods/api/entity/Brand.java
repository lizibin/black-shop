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

import java.util.Date;

/**
 * 品牌实体
 * @author zibin
 */
@Data
public class Brand {

	/**
	 * 品牌id
	 */
	@TableId(value = "brand_id", type = IdType.AUTO)
	private Long brandId;

	/**
	 * 品牌名称
	 */
	private String name;

	/**
	 * 品牌logo
	 */
	private String logo;

	/**
	 * 品牌简介
	 */
	private String brief;

	/**
	 * 状态，(0下线，1上线)
	 */
	private Integer status;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;
}