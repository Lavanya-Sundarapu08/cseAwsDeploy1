package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class cseController {
	@GetMapping("/home")
	public String rocks() {
		return "Done by 23MH1A05J4";
	}
	
	@GetMapping("/cse")
	public String rocks1() {
		return "Welcome ti Aditya IT";
	}
}
