package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	// how to use a Model

	// Model, ModelMap and ModelAndview to define a model in spring mvc
	// Model --> used to add attributes to the model.
	// ModelMap --> defines a holder for model attributes & is primarily designed
	// for adding attributes
	// ModelAndView --> holder for model and a view

	@RequestMapping("/hello")
	public String welcome(ModelMap model) {
		
		model.addAttribute("message", "hello and welcome to the project"); // addAttribute(String name,Object value)
		
		return "hello";
	}
	
}
