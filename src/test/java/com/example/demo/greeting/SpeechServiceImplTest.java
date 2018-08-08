package com.example.demo.greeting;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.example.demo.ApplicationTests;

public class SpeechServiceImplTest extends ApplicationTests {
	
	private SpeechServiceImpl speechServiceImpl;
	
	@Test
	public void testGetName() {
		assertEquals(speechServiceImpl.getName(), SpeechServiceImpl.DEFAULT_NAME);
	}
	
	public void testGetAge() {
		assertEquals(speechServiceImpl.getAge(), SpeechServiceImpl.DEFAULT_AGE);
	}
	
}
