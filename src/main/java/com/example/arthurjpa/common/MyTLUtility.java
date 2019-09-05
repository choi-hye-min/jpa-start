package com.example.arthurjpa.common;

import org.springframework.stereotype.Component;

@Component
public class MyTLUtility {

    public String masking(String str){

        return str+"**";
    }
}
