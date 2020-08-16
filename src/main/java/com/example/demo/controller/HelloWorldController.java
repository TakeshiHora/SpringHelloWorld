package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HelloWorldController {
    
    @GetMapping("/hello")
    public String getHelloWorld(){
        HelloService helloService = new HelloService();
        
        return helloService.getHelloWorld();
    }
}
