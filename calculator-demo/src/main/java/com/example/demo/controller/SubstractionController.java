package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subs")
public class SubstractionController {

	@GetMapping
	public String subStract() {
		return "in subrsction()";
	}
}
