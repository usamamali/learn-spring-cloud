package com.spring.cloud.eureka.client.adjective;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudEurekaClientAdjectiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClientAdjectiveApplication.class, args);
	}

}
