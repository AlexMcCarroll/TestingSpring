package com.example.demo.translation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranslationServiceImpl implements TranslationService {

	@Autowired
	TranslationRepository transRepo; // will create a instance of userRepository

	@Override
	public Translation createTranslation(Translation translation) {
		return this.transRepo.save(translation);
	}

	@Override
	public List<Translation> getAllTranslations() {
		return this.transRepo.findAll();
	}

	@Override
	public Translation getTranslation(String id) {
		java.util.Optional<Translation> translation = this.transRepo.findById(id);
		if (translation.isPresent()) {
			return translation.get();
		}
		return null;
	}

	@Override
	public long getNumberTranslations() {
		return this.transRepo.count();
	}

}
