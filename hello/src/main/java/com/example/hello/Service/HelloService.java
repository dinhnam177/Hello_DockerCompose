package com.example.hello.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    public String getName(){
        RestTemplate template = new RestTemplate();
        String nameUrl = "http://name:8091/";
        return template.getForObject(nameUrl,String.class);
    }
}
