package com.practice.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

	@GetMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormV2")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		String theName = request.getParameter("studentName");
		theName = theName.toUpperCase();
		
		String result = "YO! " + theName;
		
		model.addAttribute("message", result);
		
		return "helloWorld";
	}
	
	@PostMapping("/processFormV3")
	public String processFormV3(@RequestParam("studentName") String theName, Model model) {
		
		theName = theName.toUpperCase();
		
		String result = "Hey My Friend from V3! " + theName;
		
		model.addAttribute("message", result);
		
		return "helloWorld";
	}
}
