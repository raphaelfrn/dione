package com.dione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SubCategoryController {

	@GetMapping("/sub-category")
	public String getSubCategory() {
		return "pages/sub-category";
	}
	
	
	@PostMapping("/sub-category")
	public String postSubCategory() {
		return "pages/sub-category";
	}
}
