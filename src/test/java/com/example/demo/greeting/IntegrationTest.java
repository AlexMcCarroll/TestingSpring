package com.example.demo.greeting;

import static org.testng.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.web.bind.annotation.RestController;

public class IntegrationTest {
	
//	@Autowired
//    private PersonController controller;
	
	public PersonController controller = new PersonController();

	@Test
    public void testGetMessage() {
        // System.out.printf("My name is %s. I am %d years old.", SpeechServiceImpl.DEFAULT_NAME, SpeechServiceImpl.DEFAULT_AGE);
		
        ResponseEntity<Person> response = controller.getGreeting();
		
        assertEquals(response.getStatusCode(), HttpStatus.OK);
        assertEquals(response.getBody().getMessage(), String.format("My name is %s. I am %d years old.", SpeechServiceImpl.DEFAULT_NAME, SpeechServiceImpl.DEFAULT_AGE));
    }


}
