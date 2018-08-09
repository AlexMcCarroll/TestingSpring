package com.example.demo.translation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ExceptionHandler.NotFoundException;

@RestController
public class TranslationController {

	@Autowired
	private TranslationService translationService;

	@RequestMapping(value = "/translation", method = RequestMethod.GET)
	public List<Translation> getTranslation() {

		List translation = translationService.getAllTranslations();
		System.out.println("translation:" + translation);
		return translation;
	}

	@RequestMapping(value = "/translation", method = RequestMethod.POST)
	public ResponseEntity<Translation> saveTranslation(@RequestBody Translation translation) {

		translation.setId(String.valueOf(translationService.getNumberTranslations() + 1));
		translationService.createTranslation(translation);		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("MyResponseHeader", "MyValue");
		return new ResponseEntity<>(translation, responseHeaders, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/translation/{translationId}", method = RequestMethod.GET)
	public ResponseEntity<Translation> getTranslation(@PathVariable String translationId) {

		Translation translation = translationService.getTranslation(translationId);
		if (translation == null) {
			throw new NotFoundException();
		}
		return new ResponseEntity<Translation>(translation, HttpStatus.OK);
	}

}
