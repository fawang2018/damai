package com.dm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

@Controller
public class Test {
    @Autowired
    private ServletContext servletContext;

    @RequestMapping("/saoma")
    public String saoma(HttpSession session){
        servletContext.setAttribute("uid",1);
        //存了可以直接返回手机的成功页面，不要返回登陆页面，因为这是手机端的操作
        return "redirect:/sucess.html";
    }
}
