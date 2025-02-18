package com.cognizant.learn.microsvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.learn.microsvc.service.HelloService;

//@Controller
@RestController
@RequestMapping("/")
public class HelloController {

	private HelloService helloService;
	
	public HelloController(HelloService service) {
		super();
		this.helloService = service;
	}

	@GetMapping(value="getMessage", produces="application/json")
	public String getMessage() {
		return this.helloService.getMessage();
	}
	
	public String setMessage(String message) {
		return this.helloService.setMessage(message);
	}
}
