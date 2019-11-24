package com.sureshtech.springbootmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller	
public class HomeController {
	Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/home")
	public String home(Model model) {
		log.info(" home method");
		model.addAttribute("message", "Spring Boot MVC  example  with Thymeleaf template");
		return "home";
	}
	
	@GetMapping("/")
	public String root(Model model) {
		log.info(" root method");
		model.addAttribute("message", "Spring Boot MVC  example  with Thymeleaf template");
		return "index";
	}

}
