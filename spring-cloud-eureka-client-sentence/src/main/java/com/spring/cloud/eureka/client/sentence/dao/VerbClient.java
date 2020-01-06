/**
 * 
 */
package com.spring.cloud.eureka.client.sentence.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author usama
 *
 */
@FeignClient("EUREKA-CLIENT-VERB")
public interface VerbClient {
	
	@GetMapping("/")
	public String getWord();

}
