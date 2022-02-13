package com.dubbo.spring.cloud.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.spring.cloud.api.HelloProvider;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HelloProviderImpl implements HelloProvider {

    @Value("${spring.profile.active}")
    private String env;

    @Override
    public String hello(String name) {
        return "Hello, " + name;
    }

    @Override
    public List<Map<String, String>> testMapList(Map<String, String> map) {
        List<Map<String, String>> resultList = new ArrayList<>();
        resultList.add(map);
        HashMap<String, String> testMap = new HashMap<>();
        testMap.put("env", env);
        testMap.put("testKey", "testVal");
        resultList.add(testMap);
        return resultList;
    }
}
