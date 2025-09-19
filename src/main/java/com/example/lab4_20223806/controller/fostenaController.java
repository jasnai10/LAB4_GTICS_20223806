package com.example.lab4_20223806.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

@RequestMapping(value = "/fostena", method = RequestMethod.GET)
public class fostenaController {

    @GetMapping(value="/mapa")
    public String inicio(){
        return "inicio";
    }

    @GetMapping(value="/laberinto")
    public String mapa (){
        return "laberinto";
    }

}
