package com.xc.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author changxu13
 * @date 2021/8/4 10:45
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulConsumerMain {

	public static void main(String[] args) {
		SpringApplication.run(ConsulConsumerMain.class, args);
	}
}
