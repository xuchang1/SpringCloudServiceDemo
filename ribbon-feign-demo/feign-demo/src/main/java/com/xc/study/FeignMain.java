package com.xc.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author changxu13
 * @date 2021/8/4 15:17
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignMain {
	public static void main(String[] args) {
		SpringApplication.run(FeignMain.class, args);
	}
}
