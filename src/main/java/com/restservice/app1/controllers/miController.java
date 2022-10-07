package com.restservice.app1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class miController {
    
  //  @RequestMapping(value = "holaMundo")
    public String holaMundo(){

        return "index";
    }
    
}
