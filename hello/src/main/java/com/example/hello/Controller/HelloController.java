package com.example.hello.Controller;

import com.example.hello.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("/")
    public String hello() {
        return "Hello " + helloService.getName();
    }
}
