package com.yangsen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestController {
    //@RequestMapping(value = "/rHello/{a}/{b}",method = RequestMethod.POST)
    @PostMapping(value = "/rHello/{a}/{b}")
    //@PathVariable的作用是标记a b采用URL赋值
    // eg:http://localhost:8080/springmvc_war/rHello/1/2
    public String hello(@PathVariable int a, @PathVariable String b, Model model) {
        String r = a + b;
        model.addAttribute("msg", "a+b=" + r);
        //return的字符串是文件名字，eg:hello.jsp
        //想重定向 return "redirect:hello" 加了redirect:
        return "hello";
    }
}
