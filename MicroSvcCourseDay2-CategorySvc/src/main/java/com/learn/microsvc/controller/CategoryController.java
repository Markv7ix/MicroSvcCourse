package com.learn.microsvc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.microsvc.model.Category;
import com.learn.microsvc.service.CategoryService;

import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value="/category")
@Slf4j
public class CategoryController {

	private CategoryService categoryService;
	
	public CategoryController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}
	
	@GetMapping(value="/all", produces="application/json")
	public List<Category> getAllCategories() {
		return categoryService.getAllCategories();
	}
	
	@GetMapping(value = "/{id}", produces="application/json")
	public Category getCategory(@PathVariable long id) {
		Optional<Category> result = categoryService.getCategoryById(id);
		if(result.isEmpty()) {
			log.info("Category id: {1} not found", id);
			throw new NotFoundException("Category was not found!");
		}
		return result.get();
	}
}
