package com.atguigu.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@ResponseBody   //这个类的所有方法返回的数据直接写给浏览器（如果对象转为json数据）
@Controller
//@Validated
//@RestController
public class HelloController {

    @Value("${person.last-name}")
    private String name;
//    @RequestMapping("/hello")
//    public String hello(){
//        return "hello world quick";
//    }
    @RequestMapping("/sayhello")   //是在网页中请求的时候输入的localhost:8080/sayhello
    public String sayHello(){
        return "hello"+name;
    }

}
