package com.dione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HeaderController {

	@GetMapping("/header")
	public String getHeader() {
		return "pages/header";
	}
	
	
	@PostMapping("/header")
	public String postHeader() {
		return "pages/header";
	}
}
	
