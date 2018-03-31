package com.example.devopsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sh on 2018/3/31.
 * @description
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/")
    public String index(){
        System.out.println("请求进入");
        return "index";
    }
}
