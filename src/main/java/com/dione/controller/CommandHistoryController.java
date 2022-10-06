package com.dione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommandHistoryController {
	
	@GetMapping("/history")
	public String getHistory() {
		return "pages/history";
	}
	
	
	@PostMapping("/history")
	public String postHistory() {
		return "pages/history";
	}
}
