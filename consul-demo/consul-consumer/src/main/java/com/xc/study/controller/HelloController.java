package com.xc.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @author changxu13
 * @date 2021/8/4 10:45
 */
@RestController
public class HelloController {

	@Autowired
	private LoadBalancerClient loadBalancerClient;

	@GetMapping("hello")
	public String hello() {
		// service-provider为服务提供者注册到Consul上的服务名称
		ServiceInstance serviceInstance = loadBalancerClient.choose("service-provider");
		URI uri = serviceInstance.getUri();
		return new RestTemplate().getForObject(uri + "hello", String.class);
	}
}
