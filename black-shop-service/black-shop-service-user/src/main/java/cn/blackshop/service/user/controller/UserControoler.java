package cn.blackshop.service.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.blackshop.basic.redis.util.RedisUtil;

@RestController
public class UserControoler {

  @Autowired
  private RedisUtil redisUtil;
  
  @RequestMapping("/putUserName")
  public String putUserName(String userName) {
    if("".equals(userName) || null==userName){
      return "FAIL";
    }
    System.out.println("userName="+userName);
    redisUtil.set("userName", userName);
    return "OK";
  }
}
