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
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

/**
 * 系统用户角色
 *
 * @author zibin
 */
@Data
@TableName("bs_sys_role")
public class SysRole extends Model<SysRole> {
	private static final long serialVersionUID = 1L;

	/**
	 * 角色ID
	 */
	@TableId(value = "role_id")
	private Long roleId;

	/**
	 * 角色名称
	 */
	@NotBlank(message = "角色名称不能为空")
	private String roleName;

	/**
	 * 备注
	 */
	private String remark;

	@TableField(exist = false)
	private List<Long> menuIdList;

	/**
	 * 创建时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;
}
