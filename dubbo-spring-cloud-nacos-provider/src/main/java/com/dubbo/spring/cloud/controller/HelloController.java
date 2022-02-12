package com.dubbo.spring.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @GetMapping(value = "/hello/{str}", produces = "application/json")
    public String hello(@PathVariable String name) {
        log.info("---------- Main Provider Receive Msg --------");
        return "Hello Consumer: " + name + ", Provider receive your msg";
    }
}
