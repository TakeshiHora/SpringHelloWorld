package com.example.demo.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldControllerTest {
    
    @Test
    public void getHelloWorldTest(){
        HelloWorldController helloWorldController = new HelloWorldController();
        
        System.out.println(helloWorldController.getHelloWorld());
    }
    

}