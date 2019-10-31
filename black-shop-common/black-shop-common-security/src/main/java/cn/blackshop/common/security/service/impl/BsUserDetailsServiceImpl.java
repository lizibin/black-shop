/**

 * <p>Company: www.black-shop.cn</p>

 * <p>Copyright: Copyright (c) 2018-2050</p>

 * black-shop(黑店) 版权所有,并保留所有权利。

 */
package cn.blackshop.common.security.service.impl;

import cn.blackshop.common.core.basic.ResponseResult;
import cn.blackshop.common.security.dto.SecurityUserDetail;
import cn.blackshop.common.security.service.BsUserDetailsService;
import cn.blackshop.user.api.client.SysUserServiceClient;
import cn.blackshop.user.api.dto.UserInfoDTO;
import cn.blackshop.user.api.dto.o.SysUserDTO;
import cn.blackshop.user.api.dto.o.UserOutDTO;
import cn.hutool.core.util.ArrayUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


/**
 * UserDetail实现
 *
 * @author zibin
 */
@AllArgsConstructor
@Service
@Slf4j
public class BsUserDetailsServiceImpl implements BsUserDetailsService {
	//	private final CacheManager cacheManager;
	private final SysUserServiceClient sysUserServiceClient;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		Cache cache = cacheManager.getCache(CacheConstants.USER_DETAILS);
//		if (cache != null && cache.get(username) != null) {
//			return (SecurityUserDetail) cache.get(username).get();
//		}
		ResponseResult<UserInfoDTO> userOutDto = sysUserServiceClient.info(username);
		UserDetails userDetails = buildUserDails(userOutDto);
		//cache.put(username,userDetails);
		return userDetails;
	}

	@Override
	public UserDetails loadUserBySocial(String type) throws UsernameNotFoundException {
		return null;
	}


	/**
	 * buildUserDails 构建用户详情
	 * @param result
	 * @return
	 */
	private UserDetails buildUserDails(ResponseResult<UserInfoDTO> result) {
		if (result == null || !result.hasBody()) {
			log.error("用户信息错误或不存在！！！");
			throw new UsernameNotFoundException("用户信息不存在");
		}
		UserInfoDTO userinfo = result.getResult();
		Set<String> dbAuthsSet = new HashSet<>();

		if(ArrayUtil.isNotEmpty(userinfo.getPermissions())){
			// 获取角色
			Arrays.stream(userinfo.getRoles()).forEach(roleId -> dbAuthsSet.add("ROLE_" + roleId));
			// 获取资源
			dbAuthsSet.addAll(Arrays.asList(userinfo.getPermissions()));
		}
		Collection<? extends GrantedAuthority> authorities
				= AuthorityUtils.createAuthorityList(dbAuthsSet.toArray(new String[0]));
		SysUserDTO sysUserDTO = userinfo.getSysUser();
		return new SecurityUserDetail(sysUserDTO.getUserId(), sysUserDTO.getUsername(), "{bcrypt}" + sysUserDTO.getPassword(),
				true, true, true, true, authorities);
	}

}
