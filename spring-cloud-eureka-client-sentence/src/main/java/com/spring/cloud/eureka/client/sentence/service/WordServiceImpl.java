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
import com.spring.cloud.eureka.client.sentence.domain.Word;

/**
 * @author usama
 *
 */
@Service
public class WordServiceImpl implements WordService {
	
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

	@Override
	public Word getSubject() {
		return new Word(subjectClient.getWord());
	}

	@Override
	public Word getVerb() {
		return new Word(verbClient.getWord());
	}

	@Override
	public Word getArticle() {
		return new Word(articleClient.getWord());
	}

	@Override
	public Word getAdjective() {
		return new Word(adjectiveClient.getWord());
	}

	@Override
	public Word getNoun() {
		return new Word(nounClient.getWord());
	}

}
