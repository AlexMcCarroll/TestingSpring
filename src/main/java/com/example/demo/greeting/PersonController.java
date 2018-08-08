package com.example.demo.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class PersonController {
	
	private final static String PAGE_ENDPOINT = "/intro";
	
    @GetMapping("/")
    	public String hello() {
    	return "hello :)";
    }
    
    @Autowired
    private SpeechService speech; // interface
	
    @RequestMapping(value = PAGE_ENDPOINT, method = RequestMethod.GET)
    public ResponseEntity<Person> getGreeting() {
    	    	
    	Person person = new Person();
    	
    	person.setMessage(String.format("My name is %s. I am %d years old.", speech.getName(), speech.getAge()));
    	
		return new ResponseEntity<>(person, HttpStatus.OK);	
    }
}
