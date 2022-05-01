package com.spears.CiCdDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CiCdDemoController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "Hello World from SpringBoot";
    }


    @RequestMapping(value = "/another", method = RequestMethod.GET)
    public String index2(){
        return "Another Hello World from SpringBoot";
    }

}
