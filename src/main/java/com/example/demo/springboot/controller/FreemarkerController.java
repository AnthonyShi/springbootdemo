package com.example.demo.springboot.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("freemarker")
public class FreemarkerController {
	@RequestMapping("hello")
    public String hello(Map<String,Object> map) {
        
        map.put("msg", "Hello Freemarker");
        return map.get("msg").toString();
    }

}
