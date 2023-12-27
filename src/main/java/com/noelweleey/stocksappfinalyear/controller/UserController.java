package com.noelweleey.stocksappfinalyear.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/damn")
    public String damn(){
        return "Damn Daniel";
    }

}
