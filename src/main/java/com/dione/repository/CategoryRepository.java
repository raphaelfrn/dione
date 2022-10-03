package com.dione.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dione.model.CategoryModel;

public interface CategoryRepository extends JpaRepository<CategoryModel,Long>{

}
