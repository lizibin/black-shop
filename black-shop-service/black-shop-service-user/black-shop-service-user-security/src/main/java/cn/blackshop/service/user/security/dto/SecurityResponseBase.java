/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.service.user.security.dto;

import cn.blackshop.common.basic.core.ResponseBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**  

* <p>Title: SecurityResponseBase</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2019年1月18日  

*/
@Data
@EqualsAndHashCode(callSuper=false)
public class SecurityResponseBase extends ResponseBase{

	 private String jwtToken;
}
