package com.feign;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldServiceFailure implements HelloWorldService {
    @Override
    public String hello() {
        return "hello world service is not available !";
    }

    @Override
    public String hello2() {
        return "client1: hello world service is not available !";
    }
}
