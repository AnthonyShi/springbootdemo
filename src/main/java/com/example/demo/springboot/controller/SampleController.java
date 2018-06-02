package com.example.demo.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping("/")
    String home() {
        return "Hello Worlda!";
    }
	
	
	@RequestMapping("/hello")
    String hello() {
        return "Hello World Anthony!";
    }

}
