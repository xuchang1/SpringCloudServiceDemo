package com.xc.study.controller;

import com.xc.study.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author changxu13
 * @date 2021/8/4 10:33
 */
@RestController
@RequestMapping("pre")
public class HelloController {

	@Value("${spring.application.name}")
	private String name;

	@Value("${server.port}")
	private String port;

	@GetMapping("hello")
	public String hello() {
		return name + ":" + port;
	}

	@GetMapping("get1")
	public String get1(@RequestParam String id1, @RequestParam String id2){
		return name + ":" + port + "," + id1 + "," + id2;
	}

	@PostMapping("post1")
	public String post1(@RequestBody User user){
		return name + ":" + port + "," + user.getName() + "," + user.getAge();
	}
}
