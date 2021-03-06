package com.liujun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liujun on 2019/3/31.
 * 页面管理控制器
 */
@Controller
public class PageController {
    @RequestMapping("/{page}")
    public String requestPage(@PathVariable String page) {
        return page;
    }

    @RequestMapping("/")
    public String requestIndex(){
        return "index";
    }
}
