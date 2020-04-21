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
 * 分类实体
 * @author zibin
 */
@Data
public class Category {

	/**
	 * 主键id
	 */
	@TableId(value = "category_id", type = IdType.AUTO)
	private Long categoryId;

	/**
	 * 分类名称
	 */
	private String name;

	/**
	 * 父类id，为0则为顶级
	 */
	private Integer parentId;

	/**
	 * 分类图标
	 */
	private String icon;

	/**
	 * 创建时间
	 */
	private Date create_time;

	/**
	 * 更新时间
	 */
	private Date update_time;
}
