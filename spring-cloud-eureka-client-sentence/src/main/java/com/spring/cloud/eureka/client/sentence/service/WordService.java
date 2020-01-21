/**
 * 
 */
package com.spring.cloud.eureka.client.sentence.service;

import com.spring.cloud.eureka.client.sentence.domain.Word;

/**
 * @author usama
 *
 */
public interface WordService {
	
	Word getSubject();
	Word getVerb();
	Word getArticle();
	Word getAdjective();
	Word getNoun();

}
