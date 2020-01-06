package com.spring.cloud.eureka.client.sentence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.spring.cloud.eureka.client.sentence.service.SentenceService;

import java.net.URI;
import java.util.List;

@RestController
public class SentenceController {

@Autowired
SentenceService sentenceService;

	@GetMapping("/sentence")
	public @ResponseBody String getSentence() {
		return sentenceService.getSentence();
	}


}
