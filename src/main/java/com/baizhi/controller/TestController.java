package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("admin")
public class TestController {

    @ResponseBody
    @RequestMapping("test")
    public String test(){
        return "ok";
    }
}
