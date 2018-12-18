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

import cn.blackshop.basic.BaseApiService;
import cn.blackshop.mapper.UserMapper;
import cn.blackshop.model.User;
import cn.blackshop.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;

/**

* <p>Title: UserServiceImpl</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2018年12月3日  

*/
@Service(value = "userService")
@Slf4j
@Api(tags = "会员服务接口")
public class UserServiceImpl extends BaseApiService implements UserService {

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

    @ApiOperation("查询所有用户信息分页")
	@ApiResponse(code = 200, message = "查询结果成功")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "获取数据成功"), @ApiResponse(code = 400, message = "参数错误"), })
    public String queryUser() {

        PageInfo<Object> pageInfo = PageHelper.startPage(1, 2).setOrderBy("user_id desc").doSelectPageInfo(() -> this.userMapper.selectAll());
        log.info("[lambda写法] - [分页信息] - [{}]", pageInfo.toString());

        return "sucess";
    }
}
