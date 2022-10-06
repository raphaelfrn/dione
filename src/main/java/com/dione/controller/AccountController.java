package com.dione.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class AccountController {


	@GetMapping("/account")
	public String getAccount() {
		return "pages/account";
	}
	
	
	@PostMapping("/account")
	public String postAccount() {
		return "pages/account";
	}
	
}
