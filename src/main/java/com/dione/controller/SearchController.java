package com.dione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SearchController {

	@GetMapping("/search")
	public String getSearch() {
		return "pages/search";
	}
	
	
	@PostMapping("/search")
	public String postSearch() {
		return "pages/search";
	}
}
