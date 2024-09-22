package com.practice.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/hello")
	public String getHello(Model theModel) {
		theModel.addAttribute("theDate",new java.util.Date());
		return "helloworld";
	}
	
}
