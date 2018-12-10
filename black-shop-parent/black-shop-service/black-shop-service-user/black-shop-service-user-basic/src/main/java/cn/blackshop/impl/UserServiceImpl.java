/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.blackshop.mapper.UserMapper;
import cn.blackshop.model.User;
import cn.blackshop.service.UserService;
import lombok.extern.slf4j.Slf4j;

/**

* <p>Title: UserServiceImpl</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2018年12月3日  

*/
@Service(value = "userService")
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String getUser() {

        User user =  userMapper.getUser(1);

        if(null == user){
            return "success!";
        }

      return user.toString();
    }

    @Override
    public String queryUser() {

        PageInfo<Object> pageInfo = PageHelper.startPage(1, 2).setOrderBy("user_id desc").doSelectPageInfo(() -> this.userMapper.selectAll());
        log.info("[lambda写法] - [分页信息] - [{}]", pageInfo.toString());

        return "sucess";
    }
}
