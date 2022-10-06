package com.dione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConfirmationController {

	@GetMapping("/confirmation")
	public String getConfirmation() {
		return "pages/confirmation";
	}
	
	
	@PostMapping("/confirmation")
	public String postConfirmation() {
		return "pages/confirmation";
	}
}
