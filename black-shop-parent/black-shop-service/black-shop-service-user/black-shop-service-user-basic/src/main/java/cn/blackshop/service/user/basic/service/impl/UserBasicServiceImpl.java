/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.service.user.basic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import cn.blackshop.model.user.entity.User;
import cn.blackshop.service.api.user.basic.UserBasicService;
import cn.blackshop.service.user.basic.mapper.UserBasicMapper;

/**  

* <p>Title: UserBasicServiceImpl</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2019年1月11日  

*/
@RestController
@Service(value="userBasicService")
public class UserBasicServiceImpl implements UserBasicService{

	@Autowired
	private UserBasicMapper userBasicMapper;
	/**
	 * 根据用户名查询用户
	 */
	@Override
	public User getUserByNickName(String nickName) {
		return userBasicMapper.getUserByNickName(nickName);
	}

	/**
	 * 批量查询用户集合
	 */
	@Override
	public List<User> queryUserList() {
		return userBasicMapper.queryUserList();
	}

}
