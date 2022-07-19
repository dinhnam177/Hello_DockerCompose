package com.example.name.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @GetMapping("/")
    public String getName(){
        return "Nguyen Dinh Nam";
    }
}
