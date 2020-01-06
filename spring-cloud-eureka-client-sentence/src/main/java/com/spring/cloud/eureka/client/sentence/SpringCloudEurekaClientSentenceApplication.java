package com.spring.cloud.eureka.client.sentence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudEurekaClientSentenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClientSentenceApplication.class, args);
	}
	
	  //  This "LoadBalanced" RestTemplate 
	  //  is automatically hooked into Ribbon:
	  @Bean @LoadBalanced
	  RestTemplate restTemplate() {
	      return new RestTemplate();
	  }  

}
