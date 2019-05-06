/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.user.service;

import cn.blackshop.basic.redis.util.RedisUtil;
import cn.blackshop.common.basic.constants.Constants;
import cn.blackshop.common.basic.core.ApiService;
import cn.blackshop.common.basic.core.ResponseResult;
import cn.blackshop.common.utils.BeanUtils;
import cn.blackshop.common.utils.StringUtils;
import cn.blackshop.model.user.dto.out.UserOutDTO;
import cn.blackshop.model.user.entity.User;
import cn.blackshop.user.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserBasicServiceImpl
 * @author zibin
 */
@Service
@AllArgsConstructor
public class UserService extends ApiService {
    private final UserMapper userMapper;
    private final RedisUtil redisUtil;

    /**
     * 根据用户名查询用户
     */
    public ResponseResult<UserOutDTO> getUserByNickName(String nickName) {
        User user = userMapper.getUserByNickName(nickName);
        BeanUtils.copyEntityProperties(user, UserOutDTO.class);
        return setResultSuccess();
    }

    /**
     * 批量查询用户集合
     */
    public ResponseResult<List<UserOutDTO>> queryUserList() {
        List<User> userList = userMapper.queryUserList();
        List<UserOutDTO> userDTOs = BeanUtils.batchTransform(UserOutDTO.class, userList);
        /*return setResultSuccess(userDTOs);*/
        return null;
    }

    public ResponseResult<UserOutDTO> existMobileNumber(String mobileNumber) {
        if (StringUtils.isBlank(mobileNumber)) {
            return setResultError("手机号码不能为空!");
        }
        User user = userMapper.existMobileNumber();
        if (user == null) {
            return setResultError(Constants.HTTP_RES_CODE_EXISTMOBILE_203, "用户信息不存在!");
        }
        UserOutDTO userOutDTO = BeanUtils.transfrom(UserOutDTO.class, user);
        return setResultSuccess(userOutDTO);
    }

    public ResponseResult<UserOutDTO> getUserInfo(String token) {
        return null;
    }

    public ResponseResult<UserOutDTO> getUserByUserName(String userName) {
        return null;
    }
}
