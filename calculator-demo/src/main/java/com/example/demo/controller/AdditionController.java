package com.example.demo.controller;

import org.apache.logging.log4j.message.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AdditionController {

	
	@GetMapping
	public String add() {
		
		log.info("inside of add()|| Add().....");
		log.trace("using trace() logs");
		log.debug("using trace() logs");
		log.error("using trace() logs");
		log.warn("using trace() logs");
		
		return "Reached to add()";
	}
	
	@GetMapping("/three")
	public String addThree() {
		
		log.info("loginfo at ||   addThree() ");
		return "from addThree().......";
	}
	
	@PostMapping
	public String addition() {
		
		return "in addition method..";
	}
}
