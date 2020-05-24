package com.qzgcsfcc.st.api;

import com.qzgcsfcc.st.model.ApiResult;
import com.qzgcsfcc.st.model.User;
import com.qzgcsfcc.st.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author dxc
 * @since 2020-5-24
 */
@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserService userService;


    @ResponseBody
    @RequestMapping("/login")
    public ApiResult login(@RequestBody User user) {
        return userService.login(user);
    }

}
