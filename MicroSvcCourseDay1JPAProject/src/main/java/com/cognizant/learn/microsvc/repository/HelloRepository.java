package com.cognizant.learn.microsvc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.learn.microsvc.model.HelloMessage;

@Repository
public interface HelloRepository extends CrudRepository<HelloMessage, Long> {

	

}
