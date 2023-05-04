package com.example.service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class CardsController {
	
	@GetMapping("/hello")
	public String getProperties() throws JsonProcessingException {
		return "Hello World";
	}
}
