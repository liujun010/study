package com.liujun.controller;

import com.liujun.pojo.User;
import com.liujun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

/**
 * Created by liujun on 2019/3/16.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/{userid}")
    @ResponseBody
    public User getUserById(@PathVariable Integer userid) {
        User user = userService.getUserById(userid);
        return user;
    }
}
