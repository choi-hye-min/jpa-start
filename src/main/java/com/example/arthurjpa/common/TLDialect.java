package com.example.arthurjpa.common;

import org.springframework.stereotype.Component;

@Component
public class TLDialect {

    static String masking(String str){

        return str+"***";
    }
}
