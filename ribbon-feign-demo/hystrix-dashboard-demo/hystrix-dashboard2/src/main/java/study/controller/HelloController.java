package study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.service.MyFeignClient;

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
}
