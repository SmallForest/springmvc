package com.yangsen.controller;

import com.yangsen.pojo.User;
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

    @GetMapping("/hi2") //可以获取http://localhost:8080/springmvc_war/hi2?name=张飞
    public String hello2(String name, Model model) {
        model.addAttribute("msg", name);
        return "hello";
    }

    @GetMapping("/hi3") //可以获取http://localhost:8080/springmvc_war/hi3?username=张飞
    //@RequestParam指定了字段名字
    public String hello3(@RequestParam("username") String name, Model model) {
        model.addAttribute("msg", name);
        return "hello";
    }

    @GetMapping("hi4") //可以获取 http://localhost:8080/springmvc_war/hi4?id=19&name=zhangsan&age=12
    public String hello4(User user, Model model) {
        model.addAttribute("msg", user.toString());
        return "hello";
    }
}
