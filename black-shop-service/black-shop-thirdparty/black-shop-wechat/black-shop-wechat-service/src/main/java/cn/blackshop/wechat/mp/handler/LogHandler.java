package cn.blackshop.wechat.mp.handler;

import java.util.Map;

import cn.blackshop.wechat.mp.utils.JsonUtils;
import org.springframework.stereotype.Component;

import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;

@Component
public class LogHandler extends AbstractHandler {
	@Override
	public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage, Map<String, Object> context, WxMpService wxMpService,
			WxSessionManager sessionManager) {
		this.logger.info("\n接收到请求消息，内容：{}", JsonUtils.toJson(wxMessage));
		return null;
	}

}
