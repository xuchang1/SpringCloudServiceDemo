package study.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import study.service.impl.HelloHystrix;

/**
 * @author changxu13
 * @date 2021/8/4 15:20
 */
@FeignClient(name = "service-provider", path = "pre", fallback = HelloHystrix.class)
public interface MyFeignClient {

	@GetMapping("hello")
	String hello();
}
