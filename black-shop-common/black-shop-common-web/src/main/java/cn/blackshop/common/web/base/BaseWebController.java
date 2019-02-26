/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.common.web.base;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import cn.blackshop.common.basic.constants.Constants;
import cn.blackshop.common.basic.core.ResponseResult;
import nl.bitwalker.useragentutils.Browser;
import nl.bitwalker.useragentutils.UserAgent;
import nl.bitwalker.useragentutils.Version;

public class BaseWebController {
	
	/** 500页面. */
	protected static final String ERROR_500_FTL = "500.ftl";

	// 接口直接返回true 或者false
	public Boolean isSuccess(ResponseResult<?> baseResp) {
		if (baseResp == null) {
			return false;
		}
		if (baseResp.getCode().equals(Constants.HTTP_RES_CODE_500_VALUE)) {
			return false;
		}
		return true;
	}

	/**
	 * 获取浏览器信息
	 * 
	 * @return
	 */
	public String webBrowserInfo(HttpServletRequest request) {
		// 获取浏览器信息
		Browser browser = UserAgent.parseUserAgentString(request.getHeader("User-Agent")).getBrowser();
		// 获取浏览器版本号
		Version version = browser.getVersion(request.getHeader("User-Agent"));
		String info = browser.getName() + "/" + version.getVersion();
		return info;
	}

	public void setErrorMsg(Model model, String errorMsg) {
		model.addAttribute("error", errorMsg);
	}

}
