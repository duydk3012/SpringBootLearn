package com.duydk3012.springboot.learning.myfirstapp.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FundRestController {

    //    expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello abc";
    }

    @GetMapping("/abc")
    public String demo() {
        return "Hello Boy";
    }
}
