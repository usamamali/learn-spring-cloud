/**
 * 
 */
package com.spring.cloud.eureka.client.sentence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author usama
 *
 */
@Service
public class SentenceServiceImpl implements SentenceService{
	
	@Autowired
	WordService wordService;

	public String buildSentence() {
		return String.format("%s %s %s %s %s.", wordService.getSubject().getWord(), wordService.getVerb().getWord(),
				wordService.getArticle().getWord(), wordService.getAdjective().getWord(),
				wordService.getNoun().getWord());

	}

}
