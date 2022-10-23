package com.dione.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name="sub_category")
public class SubCategoryModel {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="id_sub_category")
	private Long idSubCat;
	private String name;
	@ManyToOne
	@JoinColumn(name="idCategory")
	private CategoryModel category;
	private String image;
	private String video;
	@OneToMany(mappedBy="idProduct",cascade = CascadeType.ALL)
	private Collection<ProductModel> produits;
	
	
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
