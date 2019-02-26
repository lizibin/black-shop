/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.service.user.basic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import cn.blackshop.common.basic.constants.Constants;
import cn.blackshop.common.basic.core.ApiService;
import cn.blackshop.common.basic.core.ResponseResult;
import cn.blackshop.common.util.BeanUtils;
import cn.blackshop.common.util.MD5Util;
import cn.blackshop.common.util.StringUtils;
import cn.blackshop.model.user.dto.enter.UserEnterDTO;
import cn.blackshop.model.user.entity.User;
import cn.blackshop.service.api.user.basic.UserRegisterService;
import cn.blackshop.service.user.basic.client.VerificaWechatCodeServiceClient;
import cn.blackshop.service.user.basic.mapper.UserBasicMapper;

/**
 * 用户注册的实现类
 * 
 * @author zibin
 */
@RestController
public class UserRegisterServiceImpl extends ApiService<JSONObject> implements UserRegisterService {

  @Autowired
  private UserBasicMapper userBasicMapper;
  
  @Autowired
  private VerificaWechatCodeServiceClient wechatCodeServiceClient;

  @Override
  @Transactional
  public ResponseResult<JSONObject> register(UserEnterDTO userEnterDTO, String registCode) {
    String mobileNumber = userEnterDTO.getMobileNumber();
    if (StringUtils.isEmpty(mobileNumber)) {
      return setResultError("手机号码不能为空!");
    }
    String password = userEnterDTO.getPassword();
    if (StringUtils.isEmpty(password)) {
      return setResultError("密码不能为空!");
    }
    // // 2.验证码注册码是否正确 暂时省略 会员调用微信接口实现注册码验证
    ResponseResult<JSONObject> verificaWeixinCode = wechatCodeServiceClient.verificaWechatCode(mobileNumber, registCode);
    if (!verificaWeixinCode.getCode().equals(Constants.HTTP_RES_CODE_200)) {
      return setResultError(verificaWeixinCode.getMessage());
    }
    // 3.对用户的密码进行加密
    String newPassword = MD5Util.encode(password, mobileNumber);
    userEnterDTO.setPassword(newPassword);
    // 4.调用数据库插入数据 将请求的dto参数转换entity
    User user = BeanUtils.transfrom(User.class, userEnterDTO);
    return userBasicMapper.register(user) > 0 ? setResultSuccess("注册成功") : setResultError("注册失败!");
  }
}
