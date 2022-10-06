package com.dione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DetailsProductController {

	@GetMapping("/details-product")
	public String getDetailsProduct() {
		return "pages/details-product";
	}
	
	
	@PostMapping("/details-command")
	public String postDetailsProduct() {
		return "pages/details-product";
	}
}
