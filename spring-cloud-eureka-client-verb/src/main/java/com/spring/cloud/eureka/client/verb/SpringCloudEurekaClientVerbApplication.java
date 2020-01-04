package com.spring.cloud.eureka.client.verb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudEurekaClientVerbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClientVerbApplication.class, args);
	}

}
