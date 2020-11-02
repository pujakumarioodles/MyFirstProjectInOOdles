package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyFirstRestController {
	
	
	@GetMapping("/")
	public String fun()
	{
	return "welcome in coding world";	
	}

}
