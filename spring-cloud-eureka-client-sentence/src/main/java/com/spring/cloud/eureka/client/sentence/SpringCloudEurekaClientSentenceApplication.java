package com.spring.cloud.eureka.client.sentence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudEurekaClientSentenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClientSentenceApplication.class, args);
	}

}
