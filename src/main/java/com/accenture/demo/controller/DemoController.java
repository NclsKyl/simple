package com.accenture.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

	@GetMapping("/")
	public String home() {
		return "home";
	}
	@GetMapping("/gettext")
	public String getText(@RequestParam("name") String name, Model model){
	
		String nameReturn="Welcome "+name+"!";
		model.addAttribute("message",nameReturn);
		return "home";
		
		
	}
}
