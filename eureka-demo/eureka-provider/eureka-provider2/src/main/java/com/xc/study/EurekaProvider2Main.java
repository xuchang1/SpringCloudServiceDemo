package com.xc.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 注解@EnableDiscoveryClient : Eureka作为客户端启动
 *
 * @author changxu13
 * @date 2021/8/3 17:11
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaProvider2Main {
	public static void main(String[] args) {
		SpringApplication.run(EurekaProvider2Main.class, args);
	}
}
