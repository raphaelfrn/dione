package com.dione.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dione.repository.DetailsCommandRepository;

@Service
public class DetailsCommandService {

	@Autowired
	DetailsCommandRepository detailsCommandRepository;
}
