package com.dione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DetailsCommandController {

	@GetMapping("/details-command")
	public String getDetailsCommand() {
		return "pages/details-command";
	}
	
	
	@PostMapping("/details-command")
	public String postDetailsCommand() {
		return "pages/details-command";
	}
}
