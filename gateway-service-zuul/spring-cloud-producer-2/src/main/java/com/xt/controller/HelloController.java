package com.xt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by june on 2018/1/5.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(@RequestParam String name){
        return "hello "+name+",这是Producer2的一条消息";
    }
}
