package com.pratech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

    @RequestMapping("/")
    public String dashboard(){
        return "dashboard.html";
    }

    @RequestMapping("/login")
    public String login(){
        return "loginPage.html";
    }
    
    @RequestMapping("/test")
    public String tes() {
    	return "index.html";
    }

}
