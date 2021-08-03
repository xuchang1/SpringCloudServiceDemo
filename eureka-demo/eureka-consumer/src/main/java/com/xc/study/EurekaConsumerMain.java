package com.xc.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 注解 : @EnableDiscoveryClient作为eureka的客户端,@EnableFeignClients作为openfeign的客户端
 *
 * @author changxu13
 * @date 2021/8/3 17:48
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaConsumerMain {
	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerMain.class, args);
	}
}
