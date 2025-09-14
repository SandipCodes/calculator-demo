package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

	
	@GetMapping
	public String add() {
		return "Reached to add()";
	}
}
