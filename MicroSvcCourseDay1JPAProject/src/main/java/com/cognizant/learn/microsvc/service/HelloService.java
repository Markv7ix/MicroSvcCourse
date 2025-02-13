package com.cognizant.learn.microsvc.service;

import org.springframework.stereotype.Service;

import com.cognizant.learn.microsvc.model.HelloMessage;
import com.cognizant.learn.microsvc.repository.HelloRepository;

@Service
public class HelloService {

	private HelloRepository helloRepository;

	public HelloService(HelloRepository helloRepository) {
		super();
		this.helloRepository = helloRepository;
	}
	
	public String getMessage() {
		Iterable <HelloMessage> messages = this.helloRepository.findAll();
		String message = "";
		if(message != null && messages.iterator().hasNext()) {
			message = messages.iterator().next().getMessage();
		}
		
		return message;
	}
	
	public String setMessage(String message) {
		HelloMessage helloMessage = new HelloMessage(message);
		HelloMessage returnedMessage = this.helloRepository.save(helloMessage);
		return returnedMessage.toString();
	}
	
	
}
