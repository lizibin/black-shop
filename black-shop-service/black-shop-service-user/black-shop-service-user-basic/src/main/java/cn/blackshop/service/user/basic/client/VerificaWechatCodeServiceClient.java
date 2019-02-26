package cn.blackshop.service.user.basic.client;

import org.springframework.cloud.openfeign.FeignClient;

import cn.blackshop.service.api.thrdpary.constant.WechatServerNameConstant;
import cn.blackshop.service.api.thrdpary.wechet.VerificaWechatCodeService;

@FeignClient(WechatServerNameConstant.WECHAT_SERVICE)
public interface VerificaWechatCodeServiceClient extends VerificaWechatCodeService{}
