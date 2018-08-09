package com.example.demo.translation;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "translation")
public class Translation {
	
	@Id private String id;
	private String language;
	private String world;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String getWorld() {
		return world;
	}
	public void setWorld(String world) {
		this.world = world;
	}
}
