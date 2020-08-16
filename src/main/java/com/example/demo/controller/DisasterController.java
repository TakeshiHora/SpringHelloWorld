package com.example.demo.controller;

import com.example.demo.service.DecodeService;

import jp.ac.aiit.pbl.QZQSMDecoder;
import jp.ac.aiit.pbl.disaster.Disaster;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DisasterController {
    
    @GetMapping("/disaster")
    public Disaster getDisasterInfo(){
    
        DecodeService decodeService = new DecodeService();
        
        return decodeService.getQzqsmDecoder();
    }
}
