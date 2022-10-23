package com.dione.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dione.model.CategoryModel;
import com.dione.repository.CategoryRepository;

@Service
public class CategoryService {

@Autowired
CategoryRepository categoryRepository;

// read

public List<CategoryModel> findAll(){
	return categoryRepository.findAll();
}

}
