package com.dione.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dione.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
}
