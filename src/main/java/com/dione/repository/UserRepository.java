package com.dione.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dione.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long>{

}
