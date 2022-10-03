package com.dione.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dione.model.DetailsCommandModel;

public interface DetailsCommandRepository extends JpaRepository<DetailsCommandModel, Long>{

}
