package com.intern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.intern.client")
@SpringBootApplication
public class TestWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestWorkApplication.class, args);
	}

}
