package com.dione.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubCategoryModel {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="id_sub_category")
	private Long idSubCat;
	private String name;
	private CategoryModel category;
	private String image;
	private String video;
	
	
	public SubCategoryModel() {
		
	}


	public SubCategoryModel(Long idSubCat, String name, CategoryModel category, String image, String video) {
		
		this.idSubCat = idSubCat;
		this.name = name;
		this.category = category;
		this.image = image;
		this.video = video;
	}


	public Long getIdSubCat() {
		return idSubCat;
	}


	public void setIdSubCat(Long idSubCat) {
		this.idSubCat = idSubCat;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public CategoryModel getCategory() {
		return category;
	}


	public void setCategory(CategoryModel category) {
		this.category = category;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getVideo() {
		return video;
	}


	public void setVideo(String video) {
		this.video = video;
	}


	@Override
	public String toString() {
		return "SubCategoryModel [idSubCat=" + idSubCat + ", name=" + name + ", category=" + category + ", image="
				+ image + ", video=" + video + "]";
	}
	
	
	
	
	

}
