package com.dione.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BasketController {

	@GetMapping("/basket")
	public String getBasket() {
		return "pages/basket";
	}
	
	
	@PostMapping("/basket")
	public String postBasket() {
		return "pages/basket";
	}
}
