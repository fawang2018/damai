package com.dm.controller;

import com.alibaba.fastjson.JSON;
import com.dm.pojo.YongHu;
import com.dm.service.YongHuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.Null;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class YongHuController {

    @Autowired
    private YongHuService ys;

    @RequestMapping("zhuce")
    public String zhuce(YongHu yongHu){
        if (ys.zhuce(yongHu)>0){
            return "zhuye";
        }
        return "zhuce";
    }
//    @RequestMapping("denglu")
//    public String denglu(YongHu yongHu, Model model){
//        YongHu yongHu1 = ys.dengLu(yongHu);
//        if(yongHu1==null){
//            return "redirect:denglu.html";
//        }
//        model.addAttribute("denglu",yongHu1);
//        return "redirect:zhuye.html";
//    }

        @ResponseBody
        @RequestMapping("/dengluyanzheng")
    public String denglu(YongHu yongHu, Model model, HttpServletResponse response) throws IOException {
        List yongHu1 = ys.dengLu(yongHu);
               String json= JSON.toJSONString(yongHu1);
            return json;
    }

    @RequestMapping("/ById*")
    public String ById(int YH_ID,HttpSession session){
        YongHu yh=ys.ceshi(YH_ID);
        session.setAttribute("yh",yh);
        return "zhuye";
    }

    @RequestMapping("/gerenxinxi1*")
    public String gerenxinxi1(int YH_ID,HttpSession session){
        System.out.println("刷新页面");
        YongHu yh=ys.ceshi(YH_ID);
        session.setAttribute("yh",yh);
        String [] birth=yh.getYH_ChuSheng().split("-");
        session.setAttribute("birth",birth);
        return "gerenxinxi";
    }

    @ResponseBody
    @RequestMapping("/gengxin")
    public String gengxin(YongHu yh){
        int i=ys.gengxin(yh);
        if(1!=i){
            return "更新失败";
        }
        return "更新成功";
    }
}
