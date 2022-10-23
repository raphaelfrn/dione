package com.dione.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dione.model.CategoryModel;
import com.dione.model.SlidesModel;
import com.dione.repository.SlidesRepository;
import com.dione.services.CategoryService;

@Controller
public class HomeController {
	
	@Autowired
	CategoryService categoryService;
	@Autowired
	SlidesRepository slidesRepository;
	
	@GetMapping("/")
	public String getEmpty(Model model) {
		
		List<CategoryModel> listCat = categoryService.findAll();
		List<SlidesModel> listSlides = slidesRepository.findAll();
		model.addAttribute("listCat", listCat);
		model.addAttribute("listSlides",listSlides);
		
		
		return "pages/home";
	}
	
	
	@GetMapping("/home")
	public String getHome(Model model) {
		
		List<CategoryModel> listCat = categoryService.findAll();
		List<SlidesModel> listSlides = slidesRepository.findAll();
		model.addAttribute("listCat", listCat);
		model.addAttribute("listSlides",listSlides);
		
		return "pages/home";
	}
	
	
	
	

}
