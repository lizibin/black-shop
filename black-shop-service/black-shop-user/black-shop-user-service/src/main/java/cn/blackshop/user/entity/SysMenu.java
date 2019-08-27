/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */

package cn.blackshop.user.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * 系统菜单管理
 *
 * @author zibin
 */
@Data
@TableName("bs_sys_menu")
public class SysMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 菜单ID
	 */
	@TableId(value = "menu_id")
	private Long menuId;

	/**
	 * 父菜单ID，一级菜单为0
	 */
	@NotNull(message = "上级菜单不能为空")
	private Long parentId;

	/**
	 * 父菜单名称
	 */
	@TableField(exist = false)
	private String parentName;

	/**
	 * 菜单名称
	 */
	@NotBlank(message = "菜单名称不能为空")
	private String menuName;

	/**
	 * 菜单URL
	 */
	private String url;

	/**
	 * 授权(多个用逗号分隔，如：user:list,user:create)
	 */
	private String perms;

	/**
	 * 类型     0：目录   1：菜单   2：按钮
	 */
	private Integer type;

	/**
	 * 菜单图标
	 */
	private String icon;

	/**
	 * 排序
	 */
	private Integer order;

	/**
	 * 菜单集合
	 */
	@TableField(exist = false)
	private List<?> list;

}
