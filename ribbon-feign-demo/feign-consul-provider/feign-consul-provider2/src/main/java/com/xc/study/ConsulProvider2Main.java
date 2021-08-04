package com.xc.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author changxu13
 * @date 2021/8/4 10:31
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulProvider2Main {
	public static void main(String[] args) {
		SpringApplication.run(ConsulProvider2Main.class, args);
	}
}
