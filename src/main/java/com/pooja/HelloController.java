package com.pooja;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    String hello() {
        return "Hello World, Spring Boot!";
    }
    
    @RequestMapping("/test")
    String hello1() {
        return "2nd container also is working....!";
    }


}