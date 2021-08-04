package com.xc.study.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private LoadBalancerClient loadBalancerClient;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("hello")
    public String hello() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("provider");
        return serviceInstance.getHost() + "," + serviceInstance.getPort();
    }

    // 不走注册中心，通过配置文件中provider前缀自定义配置服务提供者列表清单
    @GetMapping("hello2")
    public String hello2() {
        return restTemplate.getForObject("http://provider/" + "pre/hello", String.class);
    }
}
