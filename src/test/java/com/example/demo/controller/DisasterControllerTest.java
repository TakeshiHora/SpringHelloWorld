package com.example.demo.controller;

import org.junit.jupiter.api.Test;

class DisasterControllerTest {
    
    @Test
    public void getDisasterInfo(){
        DisasterController disasterController = new DisasterController();
        
        System.out.println(disasterController.getDisasterInfo());
    }

}