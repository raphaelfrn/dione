package com.dione.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="image")
public class ImageModel {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="id_image")
	private Long idImage;
	@ManyToOne
	@JoinColumn(name="id_product")
	private ProductModel produit;
	private String url;
	
	public ImageModel() {
	}
	
	public ImageModel(Long idImage, ProductModel produit, String url) {
		
		this.idImage = idImage;
		this.produit = produit;
		this.url = url;
	}
	
	public Long getIdImage() {
		return idImage;
	}
	public void setIdImage(Long idImage) {
		this.idImage = idImage;
	}
	public ProductModel getProduit() {
		return produit;
	}
	public void setProduit(ProductModel produit) {
		this.produit = produit;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return "ImageModel [idImage=" + idImage + ", produit=" + produit + ", url=" + url + "]";
	}
	
	
}
