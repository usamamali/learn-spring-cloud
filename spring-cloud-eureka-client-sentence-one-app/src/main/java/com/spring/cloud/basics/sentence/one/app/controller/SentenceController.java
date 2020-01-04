/**
 * 
 */
package com.spring.cloud.basics.sentence.one.app.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author usama
 *
 */
@RestController
public class SentenceController {

	@Autowired
	private DiscoveryClient client;

	@GetMapping("/sentence")
	public @ResponseBody String getSentence() {

		return String.format("%s %s %s %s %s.", getWord("EUREKA-CLIENT-SENTENCE-ONE-APP-SUBJECT"),
				getWord("EUREKA-CLIENT-SENTENCE-ONE-APP-VERB"), getWord("EUREKA-CLIENT-SENTENCE-ONE-APP-ARTICLE"),
				getWord("EUREKA-CLIENT-SENTENCE-ONE-APP-ADJECTIVE"), getWord("EUREKA-CLIENT-SENTENCE-ONE-APP-NOUN"));
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
