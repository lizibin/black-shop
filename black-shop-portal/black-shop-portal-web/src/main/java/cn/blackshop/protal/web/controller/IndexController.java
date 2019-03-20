package cn.blackshop.protal.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.blackshop.common.basic.core.ResponseResult;
import cn.blackshop.common.utils.StringUtils;
import cn.blackshop.common.web.base.BaseWebController;
import cn.blackshop.common.web.constant.WebConstants;
import cn.blackshop.model.user.dto.out.UserOutDTO;
import cn.blackshop.protal.web.client.UserServiceClient;
import cn.blackshop.protal.web.utils.CookieUtils;

public class IndexController extends BaseWebController{

  @Autowired
  private UserServiceClient userServiceClient;
  /**
   * 跳转到index页面
   */
  private static final String INDEX_FTL = "index";
  
  @RequestMapping("/")
  public String index(HttpServletRequest request, HttpServletResponse response, Model model) {
      // 1.从cookie 中 获取 会员token
      String token = CookieUtils.getCookieValue(request, WebConstants.LOGIN_TOKEN_COOKIENAME, true);
      if (!StringUtils.isEmpty(token)) {
          // 2.调用会员服务接口,查询会员用户信息
        ResponseResult<UserOutDTO> userInfo = userServiceClient.getUserInfo(token);
          if (isSuccess(userInfo)) {
              UserOutDTO data = userInfo.getData();
              if (data != null) {
                  String mobile = data.getMobile();
                  // 对手机号码实现脱敏
                  String desensMobile = mobile.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
                  model.addAttribute("desensMobile", desensMobile);
              }

          }

      }
      return INDEX_FTL;
  }
}
