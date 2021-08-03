package com.xc.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author changxu13
 * @date 2021/8/3 16:23
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaService2Main {
	public static void main(String[] args) {
		SpringApplication.run(EurekaService2Main.class, args);
	}
}
