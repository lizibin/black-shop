/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.blackshop.user.service;

import cn.blackshop.basic.redis.util.RedisUtil;
import cn.blackshop.common.basic.constants.Constants;
import cn.blackshop.common.basic.core.ResponseResult;
import cn.blackshop.common.basic.core.ResponseResultManager;
import cn.blackshop.common.utils.BeanUtils;
import cn.blackshop.common.utils.StringUtils;
import cn.blackshop.user.api.dto.o.UserOutDTO;
import cn.blackshop.user.api.entity.User;
import cn.blackshop.user.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserBasicServiceImpl
 *
 * @author zibin
 */
@Service
@AllArgsConstructor
public class UserService {
	private final UserMapper userMapper;
	private final RedisUtil redisUtil;

	/**
	 * 根据用户名查询用户
	 */
	public ResponseResult<UserOutDTO> getUserByNickName(String nickName) {
		User user = userMapper.getUserByNickName(nickName);
		BeanUtils.copyEntityProperties(user, UserOutDTO.class);
		return ResponseResultManager.setResultSuccess();
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
			return ResponseResultManager.setResultError("手机号码不能为空!");
		}
		User user = userMapper.existMobileNumber();
		if (null == user) {
			return ResponseResultManager.setResultError(Constants.HTTP_RES_CODE_EXISTMOBILE_203, "用户信息不存在!");
		}
		UserOutDTO userOutDTO = BeanUtils.transfrom(UserOutDTO.class, user);
		return ResponseResultManager.setResultSuccess(userOutDTO);
	}

	public ResponseResult<UserOutDTO> getUserInfo(String token) {
		return null;
	}

	public ResponseResult<UserOutDTO> getUserByUserName(String userName) {
		return null;
	}
}
