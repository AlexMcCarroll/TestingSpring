package com.example.demo.greeting;

import org.springframework.stereotype.Service;

@Service
public class SpeechServiceImpl implements SpeechService {

	public final static String DEFAULT_NAME = "John";
	public final static int DEFAULT_AGE = 18;

	@Override
	public String getName() {
		return DEFAULT_NAME;
	}
	
	@Override
	public int getAge() {
		return DEFAULT_AGE;
	}

}
