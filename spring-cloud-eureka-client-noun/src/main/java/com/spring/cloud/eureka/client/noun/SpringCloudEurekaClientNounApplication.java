package com.spring.cloud.eureka.client.noun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudEurekaClientNounApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClientNounApplication.class, args);
	}

}
