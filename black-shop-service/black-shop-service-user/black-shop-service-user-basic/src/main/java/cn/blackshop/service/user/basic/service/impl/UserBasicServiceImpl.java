/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.service.user.basic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import cn.blackshop.common.basic.core.ApiService;
import cn.blackshop.common.basic.core.ResponseResult;
import cn.blackshop.model.user.entity.User;
import cn.blackshop.service.api.user.basic.UserBasicService;
import cn.blackshop.service.user.basic.mapper.UserBasicMapper;

/**
 * UserBasicServiceImpl
 * @author zibin
 */
@RestController
@Service(value="userBasicService")
public class UserBasicServiceImpl extends ApiService<User> implements UserBasicService{

	@Autowired
	private UserBasicMapper userBasicMapper;
	
	/**
	 * 根据用户名查询用户
	 */
	@Override
	public ResponseResult<User> getUserByNickName(String nickName) {
		return setResultSuccess(userBasicMapper.getUserByNickName(nickName));
	}

	/**
	 * 批量查询用户集合
	 */
	@Override
	public ResponseResult<List<User>> queryUserList() {
		return null;/*setResultSuccess(userBasicMapper.queryUserList());*/
	}

}
