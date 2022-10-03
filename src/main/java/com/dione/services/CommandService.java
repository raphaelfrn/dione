package com.dione.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dione.repository.CommandRepository;

@Service
public class CommandService {

	@Autowired
	CommandRepository commandRepository;
}
