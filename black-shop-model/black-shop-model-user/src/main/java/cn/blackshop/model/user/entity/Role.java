/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.model.user.entity;

import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

/**
 * 角色表实体对象
 * @author zibin
 *
 */
@Data
@ToString
@Table(name = "bs_role")
public class Role {

  private Long id;

  private String name;
}
