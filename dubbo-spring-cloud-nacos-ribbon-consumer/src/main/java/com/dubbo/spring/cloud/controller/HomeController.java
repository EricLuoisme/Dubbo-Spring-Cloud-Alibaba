package com.dubbo.spring.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class HomeController {

    private static final String RIBBON_CONSUMER_NAME = "Ribbony";

    private static final String PROVIDER_ADDR = "http://ali-nacos-provider/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/", produces = "applicaiton/json")
    public String home() {
        log.info("----- Consumer Begin to call the Provider -------");
        String result = restTemplate.getForObject(PROVIDER_ADDR + "hello/" + RIBBON_CONSUMER_NAME, String.class);
        return "Ribbon Consumer Receive:\n" + result;
    }
}
