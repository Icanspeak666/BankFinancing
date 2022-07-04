package com.gec.controller;

import com.gec.bean.Admin;
import com.gec.bean.User;
import com.gec.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminController {
    @Autowired
    AdminService adminService;

    //定义登录操作的请求方法
    @RequestMapping("/adminLogin")
    public String adminLogin(String name, String password, HttpServletRequest request) {
        //调用业务层进行登录校验
        Admin nowAdmin = adminService.login(name, password);
        //作出响应
        if (nowAdmin != null) {
            request.getSession().setAttribute("nowAdmin",nowAdmin);
            return "index";
        } else {
            //把信息保存在请求作用域中，目的给jsp页面获取并显示
            request.setAttribute("name", name);
            request.setAttribute("password", password);
            request.setAttribute("message", "用户名或密码错误");
            return "login";
        }
    }
}
