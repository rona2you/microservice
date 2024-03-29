package com.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String getHello(){
        return restTemplate.getForObject("http://service-helloworld/",String.class);
    }
}
