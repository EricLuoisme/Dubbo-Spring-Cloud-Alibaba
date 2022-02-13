package com.dubbo.spring.cloud.controller;

import com.dubbo.spring.cloud.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Home2Controller {

    private static final String FEIGN_CONSUMER_NAME = "Feignia";

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/", produces = "application/json")
    public String home2() {
        log.info("------ Feign Consumer Calling -------");
        String result = helloService.hello(FEIGN_CONSUMER_NAME);
        return "Feign Consumer Receive:\n" + result;
    }

}
