package com.dubbo.spring.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("ali-nacos-provider")
public interface HelloService {
    @RequestMapping(path = "hello/{name}")
    String hello(@RequestParam("name") String name);
}
