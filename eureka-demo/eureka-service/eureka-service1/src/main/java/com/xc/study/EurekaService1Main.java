package com.xc.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注解@EnableEurekaServer : Eureka作为服务端启动
 *
 * @author changxu13
 * @date 2021/8/3 16:23
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaService1Main {
	public static void main(String[] args) {
		SpringApplication.run(EurekaService1Main.class, args);
	}
}
