package com.example.arthurjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestViewController {

    @RequestMapping("/test")
    public ModelAndView index(ModelAndView mav){

        mav.setViewName("index");
        return mav;
    }
}
