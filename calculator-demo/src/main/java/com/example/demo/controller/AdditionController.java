package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AdditionController {

	
	@GetMapping
	public String add() {
		
		log.info("inside of add()|| Add().....");
		log.trace("using trace() logs");
		return "Reached to add()";
	}
}
