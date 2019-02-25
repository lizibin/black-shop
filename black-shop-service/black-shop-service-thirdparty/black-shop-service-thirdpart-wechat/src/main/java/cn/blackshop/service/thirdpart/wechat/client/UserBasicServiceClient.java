package cn.blackshop.service.thirdpart.wechat.client;

import org.springframework.cloud.openfeign.FeignClient;

import cn.blackshop.service.api.user.basic.UserBasicService;
import cn.blackshop.service.api.user.constant.UserBasicServerNameConstant;

@FeignClient(UserBasicServerNameConstant.USER_BASIC_SERVICE)
public interface UserBasicServiceClient extends UserBasicService {

}
