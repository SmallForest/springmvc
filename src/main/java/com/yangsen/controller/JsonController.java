package com.yangsen.controller;

import com.yangsen.pojo.User;
import com.yangsen.utils.JsonUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

//使用RestController注解，return将返回值字符，不再解析模板
@RestController
public class JsonController {

    @GetMapping("/j1")
    public String hello() {
        //实例化User
        User user = new User(1,"李四",10,new Date());
        return JsonUtils.getJson(user);
    }
}
