package com.example.lab4_20223806.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class fostenaController {

    @GetMapping(value="/fostena")
    public String fostena(){
        return "inicio";
    }
}
