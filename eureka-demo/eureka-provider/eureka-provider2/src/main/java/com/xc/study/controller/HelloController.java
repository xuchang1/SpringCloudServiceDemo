package com.xc.study.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author changxu13
 * @date 2021/8/3 17:23
 */
@RestController
public class HelloController {

	@Value("${spring.application.name}")
	private String name;

	@Value("${server.port}")
	private String port;

	@GetMapping("hello")
	public String hello() {
		return name + ":" + port;
	}
}
