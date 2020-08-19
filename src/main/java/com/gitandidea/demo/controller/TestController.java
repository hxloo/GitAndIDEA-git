package com.gitandidea.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String test01(){
        return "hello world";
    }
    //开发人员写了一句注释
    //开发人员第二次写了一句注释..
}
