package com.streaming.streaming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerLayouts {
    
    @RequestMapping("/polo")
    public String index(){
        return "index";
    }
}
