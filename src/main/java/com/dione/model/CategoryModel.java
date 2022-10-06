package com.dione.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CategoryModel {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="id_category")
	private Long idCategory;
	private String name;
	private String video;
	private String description;
	private String image;
	
	
	public CategoryModel(Long idCategory, String name, String video, String description, String image) {
		this.idCategory = idCategory;
		this.name = name;
		this.video = video;
		this.description = description;
		this.image = image;
	}


	public CategoryModel() {
	}


	public Long getIdCategory() {
		return idCategory;
	}


	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}


	public String getName() {
		return name;
	}


	public void SetName(String name) {
		this.name = name;
	}


	public String getVideo() {
		return video;
	}


	public void setVideo(String video) {
		this.video = video;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "CategoryModel [idCategory=" + idCategory + ", name=" + name + ", video=" + video + ", description="
				+ description + ", image=" + image + "]";
	}
	
	
	
	
	
	
}
