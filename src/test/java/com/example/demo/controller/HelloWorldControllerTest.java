package com.example.demo.controller;


import org.junit.jupiter.api.Test;

public class HelloWorldControllerTest {
    
    @Test
    public void getHelloWorldTest(){
        HelloWorldController helloWorldController = new HelloWorldController();
        
        System.out.println(helloWorldController.getHelloWorld());
    }
    
}