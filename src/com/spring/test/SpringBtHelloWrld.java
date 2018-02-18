package com.spring.test;
 
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@EnableAutoConfiguration
public class SpringBtHelloWrld {
 
    @RequestMapping("/")
    @ResponseBody
    String hello() {
        return "Hello World! Spring boot is so simple.";
    }
}