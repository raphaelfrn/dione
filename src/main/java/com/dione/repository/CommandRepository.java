package com.dione.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dione.model.CommandModel;

public interface CommandRepository extends JpaRepository<CommandModel, Long> {

}
