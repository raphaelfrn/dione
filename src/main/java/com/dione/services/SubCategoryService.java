package com.dione.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dione.repository.SubCategoryRepository;

@Service
public class SubCategoryService {

	@Autowired
	SubCategoryRepository subCategoryRepository;
}
