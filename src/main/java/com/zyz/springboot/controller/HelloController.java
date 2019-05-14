package com.zyz.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yongzhou.zhang on 2019/5/14.
 */
@RestController
public class HelloController {

    /*@Value("${person.last-name}")
    private String name;*/

    @RequestMapping("/sayHello")
    public String sayHello(){
//        return "Hello " + name;
        return "Hello";
    }
}
