package com.example.demo.translation;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface TranslationService {
	
	Translation createTranslation(Translation translation);
	List<Translation> getAllTranslations();
	Translation getTranslation(String id);
	long getNumberTranslations();
}
