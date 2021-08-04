package com.xc.study.controller;

import com.xc.study.entity.User;
import com.xc.study.service.MyFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author changxu13
 * @date 2021/8/4 15:21
 */
@RestController
public class HelloController {

	@Resource
	private MyFeignClient myFeignClient;

	@GetMapping("hello")
	public String hello(){
		return myFeignClient.hello();
	}

	@GetMapping("get1")
	public String get1(String id1, String id2){
		return myFeignClient.get1(id1, id2);
	}

	@PostMapping("post1")
	public String post1(@RequestBody User user){
		String result = myFeignClient.post1(user);
		return result;
	}
}
