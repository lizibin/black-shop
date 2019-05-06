package cn.blackshop.user.api;

import cn.blackshop.common.basic.core.ResponseResult;
import cn.blackshop.model.user.dto.out.UserOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("user")
public interface UserServiceApi {

    @GetMapping("getUserByUserName")
    ResponseResult<UserOutDTO> getUserByUserName(@RequestParam("userName") String userName);

    @PostMapping("/existMobileNumber")
    ResponseResult<UserOutDTO> existMobileNumber(@RequestParam("mobileNumber") String mobileNumber);
}
