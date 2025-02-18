package com.learn.microsvc.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.learn.microsvc.model.Category;
import com.learn.microsvc.repository.CategoryRepository;

@Service
public class CategoryService {

	private CategoryRepository categoryRepository;
	
	public CategoryService(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}

	public List<Category> getAllCategories() {
		List<Category> categoriesList = new ArrayList<>();
		Iterable<Category> categories = categoryRepository.findAll();
		for(Iterator<Category> itCat = categories.iterator(); itCat.hasNext();) {
			categoriesList.add(itCat.next());
		}
		return categoriesList;
	}
	
	public Optional<Category> getCategoryById(long id) {
		return categoryRepository.findById(id);
	}
}
