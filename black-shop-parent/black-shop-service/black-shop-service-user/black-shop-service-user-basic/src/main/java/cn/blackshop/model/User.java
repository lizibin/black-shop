/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.model;

import lombok.Data;
import lombok.ToString;

/**  

* <p>Title: User</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2018年12月6日  

*/
@Data
@ToString
public class User {
	
	private String userId;
	
	private String nickName;
	
	private String userMobile;

}
