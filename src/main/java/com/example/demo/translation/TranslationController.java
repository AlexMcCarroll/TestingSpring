package com.example.demo.translation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslationController {

	@Autowired
	private TranslationService translationService;

	@RequestMapping(value = "/translation", method = RequestMethod.GET)
	public List<Translation> getTranslation() {
		
		List translation = translationService.getAllTranslations();
		System.out.println("translation:"+ translation);
		return translation;
	
	

}
