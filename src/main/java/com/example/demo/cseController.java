package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class cseController {
	@GetMapping("/home")
	public String rocks() {
		return "Welcome to aditya CSE";
	}
	
	@GetMapping("/cse")
	public String rocks1() {
		return "Welcome ti Aditya IT";
	}
}
