package com.cognizant.learn.microsvc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloMessage {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	private String message;
	public HelloMessage(String message) {
		super();
		this.message = message;
	}
	
}
