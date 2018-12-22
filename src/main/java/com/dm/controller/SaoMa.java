package com.dm.controller;

import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.spi.http.HttpContext;

@Controller
public class SaoMa {
    @Autowired
    private ServletContext servletContext;

    @ResponseBody
    @RequestMapping("denglu1")
    public String denglu(){
        Object uid=servletContext.getAttribute("uid");
        if(uid!=null){
            return "1";
        }
        return "0";
    }
}
