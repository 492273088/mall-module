package com.mall.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/18/15:14
 **/
@RestController
@RequestMapping(value = "/home")
public class HomeController {

    @RequestMapping("/index")
    public String index(){
        return "success";
    }

}
