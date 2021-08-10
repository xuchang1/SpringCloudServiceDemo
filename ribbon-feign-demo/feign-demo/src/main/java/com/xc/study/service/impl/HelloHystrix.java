package com.xc.study.service.impl;

import com.xc.study.entity.User;
import com.xc.study.service.MyFeignClient;
import org.springframework.stereotype.Component;

/**
 * Hystrix容错回调
 *
 * @author changxu13
 * @date 2021/8/10 9:07
 */
@Component
public class HelloHystrix implements MyFeignClient {
	@Override
	public String hello() {
		return "错误值";
	}

	@Override
	public String get1(String id1, String id2) {
		return null;
	}

	@Override
	public String post1(User user) {
		return null;
	}
}
