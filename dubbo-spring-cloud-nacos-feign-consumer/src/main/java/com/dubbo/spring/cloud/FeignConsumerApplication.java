package com.dubbo.spring.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.dubbo.spring.cloud.service"})
public class FeignConsumerApplication {
}
