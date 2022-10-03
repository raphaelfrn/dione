package com.dione.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dione.repository.CategoryRepository;

@Service
public class CategoryService {

@Autowired
CategoryRepository categoryRepository;

}
