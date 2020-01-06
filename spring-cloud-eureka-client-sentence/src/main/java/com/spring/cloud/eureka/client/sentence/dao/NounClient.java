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
@FeignClient("EUREKA-CLIENT-NOUN")
public interface NounClient {
	
	@GetMapping("/")
	public String getWord();

}
