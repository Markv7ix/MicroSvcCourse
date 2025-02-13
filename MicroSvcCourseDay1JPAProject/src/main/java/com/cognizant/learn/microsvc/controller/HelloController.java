package com.cognizant.learn.microsvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cognizant.learn.microsvc.service.HelloService;

@Controller
public class HelloController {

	private HelloService helloService;
	
	public HelloController(HelloService service) {
		super();
		this.helloService = service;
	}

	public String getMessage() {
		return this.helloService.getMessage();
	}
	
	public String setMessage(String message) {
		return this.helloService.setMessage(message);
	}
}
