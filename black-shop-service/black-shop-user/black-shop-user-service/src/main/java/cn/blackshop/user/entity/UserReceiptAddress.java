/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.user.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Table;
import java.util.Date;

/**
 * 用户收货地址表实体
 * @author zibin
 */
@Data
@ToString
@Table(name = "bs_user_receipt_address")
public class UserReceiptAddress {

	/**
	 * 主键id
	 */
	private Long id;

	/**
	 * 用户id
	 */
	private Long userId;

	/**
	 * 收货人姓名
	 */
	private String consigneeName;

	/**
	 * 手机号码
	 */
	private String mobileNumber;

	/**
	 * 省份id
	 */
	private Long provinceId;

	/**
	 * 城市id
	 */
	private Long cityId;

	/**
	 * 地区id
	 */
	private Long areaId;

	/**
	 * 详细地址
	 */
	private String detailAddress;

	/**
	 * 是否为常用地址
	 */
	private Boolean isCommonAddress;

	/**
	 * 创建时间
	 */
	private Date createDate;
}
