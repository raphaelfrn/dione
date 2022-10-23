package com.dione.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dione.model.SlidesModel;
import com.dione.repository.SlidesRepository;

@Service
public class SlidesService {

	@Autowired
	SlidesRepository slidesRepository;
	
	// read
	public List<SlidesModel> findAll(){
		return slidesRepository.findAll();
	}
}
