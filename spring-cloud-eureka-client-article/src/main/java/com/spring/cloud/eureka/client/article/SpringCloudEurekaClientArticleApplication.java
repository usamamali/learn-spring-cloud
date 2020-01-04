package com.spring.cloud.eureka.client.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudEurekaClientArticleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClientArticleApplication.class, args);
	}

}
