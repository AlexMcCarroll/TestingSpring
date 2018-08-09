package com.example.demo.translation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TranslationController {

	@Autowired
	private TranslationRepository repository;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	
	public List<Translation> getTranslation() {
		
		List translation = repository.findAll();
		System.out.println("translation:"+ translation);
		return translation;
		
	}

}
