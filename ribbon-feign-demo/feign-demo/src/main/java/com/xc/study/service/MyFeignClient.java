package com.xc.study.service;

import com.xc.study.config.MyFeignConfig;
import com.xc.study.entity.User;
import com.xc.study.service.impl.HelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author changxu13
 * @date 2021/8/4 15:20
 */
@FeignClient(name = "service-provider", path = "pre", configuration = MyFeignConfig.class, fallback = HelloHystrix.class)
public interface MyFeignClient {

	@GetMapping("hello")
	String hello();

	@GetMapping("get1")
	String get1(@RequestParam String id1, @RequestParam String id2);

	@PostMapping("post1")
	String post1(@RequestBody User user);
}
