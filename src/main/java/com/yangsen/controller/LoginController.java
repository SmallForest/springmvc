package com.yangsen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("/loginPage")
    public String logPage() {
        return "loginPage";
    }

    @RequestMapping("/login")
    public String doLogin(String username, String password, HttpSession session) {
        System.out.println("doLogin==>" + username + password);
        //省略用户名密码校验过程
        //写入session
        session.setAttribute("SName", username);
        //登录成功去图书管理页
        return "redirect:/book/allBook";
    }

    @RequestMapping("/logOut")
    public String logOut(HttpSession session) {
        session.removeAttribute("SName");
        return "redirect:/loginPage";
    }
}
