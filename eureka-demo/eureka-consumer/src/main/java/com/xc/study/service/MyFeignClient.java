package com.xc.study.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * name属性为服务提供者在注册中心注册的服务名称
 *
 * @author changxu13
 * @date 2021/8/3 17:52
 */
@FeignClient(name = "eureka-provider")
public interface MyFeignClient {

	@GetMapping("hello")
	String hello();
}
