package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // stereotype annotation of @Component
public class HelloController {

	// adding the request mapping ---> URL
	@RequestMapping("/")
	public String giveWelcomeMessage() {
		return "welcome";
	}
	
	// adding the request mapping ---> URL
	@RequestMapping("/hello")
	public String giveHelloMessage() {
		return "hello";			// view file (or) jsp file => name in 'return' should match with the .jsp file name in 'view'
	}
	
	// adding the request mapping ---> URL
	@RequestMapping("/goodbye")
	public String giveGoodByeMessage() {
		return "goodbye";
	}
}
