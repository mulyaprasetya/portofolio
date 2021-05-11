package com.pratech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

    @RequestMapping("/")
    public String dashboard(){
        return "index.html";
    }

    @RequestMapping("/login")
    public String login(){
        return "loginPage.html";
    }

}
