package com.dione.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dione.model.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, Long>{

}
