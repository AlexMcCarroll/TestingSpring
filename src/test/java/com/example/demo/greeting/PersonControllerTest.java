package com.example.demo.greeting;

import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo.ApplicationTests;

public class PersonControllerTest extends ApplicationTests {
	
	@InjectMocks
	private PersonController controller = new PersonController();
	
	@Mock
	private SpeechService speechService;
	
	@Test
	public void testPostGreeting() {
		when(speechService.getName()).thenReturn(SpeechServiceImpl.DEFAULT_NAME);
		when(speechService.getAge()).thenReturn(SpeechServiceImpl.DEFAULT_AGE);
		
		ResponseEntity<Person> response = controller.getGreeting();

		assertEquals(response.getStatusCode(), HttpStatus.OK);
		assertEquals(response.getBody().getMessage(), String.format("My name is %s. I am %d years old.", SpeechServiceImpl.DEFAULT_NAME, SpeechServiceImpl.DEFAULT_AGE));
	}

}
