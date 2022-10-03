package com.dione.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dione.model.ImageModel;

public interface ImageRepository extends JpaRepository<ImageModel, Long>{

}
