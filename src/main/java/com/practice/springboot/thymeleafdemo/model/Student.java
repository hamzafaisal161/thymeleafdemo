package com.practice.springboot.thymeleafdemo.model;

import java.util.List;

import lombok.Data;

@Data
public class Student {

	public Student(){
		
	}
	
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private List<String> favoriteSystems;
	
}
