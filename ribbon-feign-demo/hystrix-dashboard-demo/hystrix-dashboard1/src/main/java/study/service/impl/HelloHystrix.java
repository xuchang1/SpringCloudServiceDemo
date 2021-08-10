package study.service.impl;

import org.springframework.stereotype.Component;
import study.service.MyFeignClient;

/**
 * @author changxu13
 * @date 2021/8/10 10:17
 */
@Component
public class HelloHystrix implements MyFeignClient {
	@Override
	public String hello() {
		return "错误提示";
	}
}
