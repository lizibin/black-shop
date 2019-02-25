/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.service.user.basic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import cn.blackshop.common.basic.core.ApiService;
import cn.blackshop.common.basic.core.ResponseResult;
import cn.blackshop.model.user.dto.enter.UserEnterDTO;
import cn.blackshop.model.user.entity.User;
import cn.blackshop.service.api.user.basic.UserRegisterService;
import cn.blackshop.service.user.basic.mapper.UserBasicMapper;

/**
 * UserRegisterServiceImpl
 * @author zibin
 */
@RestController
public class UserRegisterServiceImpl extends ApiService<JSONObject> implements UserRegisterService{

	@Autowired
	private UserBasicMapper userBasicMapper;

  @Override
  public ResponseResult<JSONObject> register(UserEnterDTO userEnterDTO, String registCode) {
    
    
    return null;
  }
}
