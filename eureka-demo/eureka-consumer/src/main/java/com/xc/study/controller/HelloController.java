package com.xc.study.controller;

import com.xc.study.service.MyFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author changxu13
 * @date 2021/8/3 17:55
 */
@RestController
public class HelloController {

	@Resource
	private MyFeignClient myFeignClient;

	@GetMapping("hello")
	public String hello() {
		return myFeignClient.hello();
	}
}
