package com.aptech.cyberlap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(Model model, HttpServletRequest request){
        return "/main/index";
    }
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(Model model,HttpServletRequest request){
        return "/main/login";
    }
    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String register(Model model,HttpServletRequest request){
        return "/main/register";
    }
}
