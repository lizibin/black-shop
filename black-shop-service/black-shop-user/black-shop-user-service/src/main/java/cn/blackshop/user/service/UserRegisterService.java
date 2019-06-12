/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.user.service;

import cn.blackshop.common.basic.constants.Constants;
import cn.blackshop.common.basic.core.ApiService;
import cn.blackshop.common.basic.core.ResponseResult;
import cn.blackshop.common.utils.BeanUtils;
import cn.blackshop.common.utils.MD5Util;
import cn.blackshop.common.utils.StringUtils;
import cn.blackshop.model.user.dto.enter.UserEnterDTO;
import cn.blackshop.model.user.entity.User;
import cn.blackshop.user.mapper.UserMapper;
import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户注册的实现类
 *
 * @author zibin
 */
@Service
@AllArgsConstructor
public class UserRegisterService extends ApiService {
    private final UserMapper userMapper;
    private final VerificaWechatCodeServiceClient wechatCodeServiceClient;

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
        return userMapper.register(user) > 0 ? setResultSuccess("注册成功") : setResultError("注册失败!");
    }
}
