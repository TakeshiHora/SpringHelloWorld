package com.example.demo.service;

import jp.ac.aiit.pbl.QZQSMDecoder;
import jp.ac.aiit.pbl.disaster.Disaster;

import org.springframework.stereotype.Service;

@Service
public class DecodeService {
    
    public Disaster getQzqsmDecoder() {
        QZQSMDecoder qzqsmDecoder = new QZQSMDecoder();
        
        Disaster decodedDisaster = qzqsmDecoder.decode("53ADF36C518002D3885A7D8B5DEA82085041AA08AD42EE2864500013B6DE7A0");
        
        return decodedDisaster;
    }
}
