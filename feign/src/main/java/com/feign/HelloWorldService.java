package com.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@FeignClient(value = "service-helloworld")
public interface HelloWorldService {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    String hello();
}
