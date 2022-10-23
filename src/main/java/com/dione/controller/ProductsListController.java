package com.dione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductsListController {

	@GetMapping("/products")
	public String getProducts() {
		return "pages/products-list";
	}
	
	
	@PostMapping("/products")
	public String postProducts() {
		return "pages/products-list";
	}
}
