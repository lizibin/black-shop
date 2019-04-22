/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018-2050</p>   

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.portal.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.blackshop.common.web.base.BaseWebController;


/**
 * @author zibin
 */
@Controller
public class IndexController extends BaseWebController {
  
  private static final String INDEX_FTL = "index";

  /**
   * Index.
   */
  @RequestMapping("/")
  public String index(HttpServletRequest request, HttpServletResponse response, Model model) {
    System.out.println("index页面访问");
    return INDEX_FTL;
  }
}
