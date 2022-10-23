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

@Entity(name="product")
public class ProductModel {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="id_product")
	private Long idProduct;
	private String name;
	private String description;
	private double prix;
	private String image;
	@ManyToOne
	@JoinColumn(name="idSubCat")
	private SubCategoryModel subCat;
	@OneToMany(mappedBy="url",cascade = CascadeType.ALL)
	private Collection<ImageModel> images;
	
	
	public ProductModel() {
	}
	
	public ProductModel(Long idProduct, String name, String description, double prix, String image,
			SubCategoryModel subCat) {
		this.idProduct = idProduct;
		this.name = name;
		this.description = description;
		this.prix = prix;
		this.image = image;
		this.subCat = subCat;
	}
	
	public Long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public SubCategoryModel getSubCat() {
		return subCat;
	}
	public void setSubCat(SubCategoryModel subCat) {
		this.subCat = subCat;
	}
	@Override
	public String toString() {
		return "ProductModel [idProduct=" + idProduct + ", name=" + name + ", description=" + description + ", prix="
				+ prix + ", image=" + image + ", subCat=" + subCat + "]";
	}
	
	
}
