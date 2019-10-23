package com.zhiy.zy.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class BaseController {
    @GetMapping("/")
    public String hello(){
        return "祖国你好";
    }
}
