/**

 * <p>Company: www.black-shop.cn</p>

 * <p>Copyright: Copyright (c) 2018-2050</p>

 * black-shop(黑店) 版权所有,并保留所有权利。

 */
package cn.blackshop.user.api.vo;

import cn.blackshop.user.api.entity.SysRole;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 页面返回user对象
 */
@Data
@ApiModel(value = "系统用户对象")
public class SysuserVO implements Serializable {


	/**
	 * 主键ID
	 */
	@ApiModelProperty(value = "主键")
	private Integer userId;
	/**
	 * 用户名
	 */
	@ApiModelProperty(value = "用户名")
	private String username;
	/**
	 * 密码
	 */
	@ApiModelProperty(value = "密码")
	private String password;
	/**
	 * 随机盐
	 */
	@ApiModelProperty(value = "随机盐")
	private String salt;

	/**
	 * 创建时间
	 */
	@ApiModelProperty(value = "创建时间")
	private LocalDateTime createTime;
	/**
	 * 修改时间
	 */
	@ApiModelProperty(value = "修改时间")
	private LocalDateTime updateTime;

	/**
	 * 手机号
	 */
	@ApiModelProperty(value = "手机号")
	private String phone;
	/**
	 * 头像
	 */
	@ApiModelProperty(value = "头像")
	private String avatar;
	/**
	 * 部门ID
	 */
	@ApiModelProperty(value = "所属部门")
	private Integer deptId;
	/**
	 * 部门名称
	 */
	@ApiModelProperty(value = "所属部门名称")
	private String deptName;
	/**
	 * 角色列表
	 */
	@ApiModelProperty(value = "拥有的角色列表")
	private List<SysRole> roleList;
}
