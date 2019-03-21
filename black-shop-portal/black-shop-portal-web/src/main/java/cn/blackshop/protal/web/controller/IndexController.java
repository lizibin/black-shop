/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018-2050</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.protal.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.blackshop.common.web.base.BaseWebController;

@Controller
public class IndexController extends BaseWebController {
  /**
   * 跳转到index页面
   */
  private static final String INDEX_FTL = "index";

  /**
   * Index.
   *
   * @param request
   *          the request
   * @param response
   *          the response
   * @param model
   *          the model
   * @return the string
   */
  @RequestMapping("/")
  public String index(HttpServletRequest request, HttpServletResponse response, Model model) {

    System.out.println("index页面访问");
    // 1.从cookie 中 获取 会员token
    /*
     * String token = CookieUtils.getCookieValue(request,
     * WebConstants.LOGIN_TOKEN_COOKIENAME, true); if
     * (!StringUtils.isEmpty(token)) { // 2.调用会员服务接口,查询会员用户信息
     * ResponseResult<UserOutDTO> userInfo =
     * userServiceClient.getUserInfo(token); if (isSuccess(userInfo)) {
     * UserOutDTO data = userInfo.getData(); if (data != null) { String mobile =
     * data.getMobile(); // 对手机号码实现脱敏 String desensMobile =
     * mobile.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
     * model.addAttribute("desensMobile", desensMobile); }
     * 
     * }
     * 
     * }
     */
    return INDEX_FTL;
  }
}
