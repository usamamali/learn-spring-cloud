package com.spring.cloud.eureka.client.sentence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
public class SentenceController {

	@Autowired
	private DiscoveryClient client;

	@GetMapping("/sentence")
	public @ResponseBody String getSentence() {
		return String.format("%s %s %s %s %s.", getWord("EUREKA-CLIENT-SUBJECT"), getWord("EUREKA-CLIENT-VERB"),
				getWord("EUREKA-CLIENT-ARTICLE"), getWord("EUREKA-CLIENT-ADJECTIVE"), getWord("EUREKA-CLIENT-NOUN"));

	}

	public String getWord(String service) {
		List<ServiceInstance> list = client.getInstances(service);
		if (list != null && list.size() > 0) {
			URI uri = list.get(0).getUri();
			if (uri != null) {
				return (new RestTemplate()).getForObject(uri, String.class);
			}
		}
		return null;
	}
}
