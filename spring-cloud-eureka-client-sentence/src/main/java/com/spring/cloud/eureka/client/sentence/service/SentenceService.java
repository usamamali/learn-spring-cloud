/**
 * 
 */
package com.spring.cloud.eureka.client.sentence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.cloud.eureka.client.sentence.dao.AdjectiveClient;
import com.spring.cloud.eureka.client.sentence.dao.ArticleClient;
import com.spring.cloud.eureka.client.sentence.dao.NounClient;
import com.spring.cloud.eureka.client.sentence.dao.SubjectClient;
import com.spring.cloud.eureka.client.sentence.dao.VerbClient;

/**
 * @author usama
 *
 */
@Service
public class SentenceService {
	
	@Autowired
	AdjectiveClient adjectiveClient;
	
	@Autowired
	ArticleClient articleClient;
	
	@Autowired
	NounClient nounClient;
	
	@Autowired
	SubjectClient subjectClient;
	
	@Autowired
	VerbClient verbClient;
	
	public String getSentence() {
		return String.format("%s %s %s %s %s.", subjectClient.getWord(), verbClient.getWord(),
				articleClient.getWord(), adjectiveClient.getWord(), nounClient.getWord());

	}

}
