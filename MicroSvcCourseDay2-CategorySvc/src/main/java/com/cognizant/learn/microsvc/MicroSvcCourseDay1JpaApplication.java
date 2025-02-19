package com.cognizant.learn.microsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cognizant.learn.microsvc.controller.HelloController;

@SpringBootApplication
public class MicroSvcCourseDay1JpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MicroSvcCourseDay1JpaApplication.class, args);
		HelloController helloController = context.getBean("helloController", HelloController.class);
		
		helloController.setMessage("Hello world of Spring");
		
		System.out.println(helloController.getMessage());
		
		
	}

}
