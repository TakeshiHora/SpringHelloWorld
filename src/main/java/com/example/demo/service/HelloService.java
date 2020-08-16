package com.example.demo.service;

import com.example.demo.model.HelloWorld;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    
    public String getHelloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setHelloWorld("HelloWorld");
        
        return helloWorld.getHelloWorld();
    }
    

}
