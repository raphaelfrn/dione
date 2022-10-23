package com.dione.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="details_command")
public class DetailsCommandModel {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="id_details_c")
	private Long idDetailsC;
	@ManyToOne
	@JoinColumn(name="idCommand")
	private CommandModel command;
	@ManyToOne
	@JoinColumn(name="idProduct")
	private ProductModel product;
	private double quantite;
	private double prix;
	
	public DetailsCommandModel() {
	}

	public DetailsCommandModel(Long idDetailsC, CommandModel command, ProductModel product, double quantite,
			double prix) {
		this.idDetailsC = idDetailsC;
		this.command = command;
		this.product = product;
		this.quantite = quantite;
		this.prix = prix;
	}

	public Long getIdDetailsC() {
		return idDetailsC;
	}

	public void setIdDetailsC(Long idDetailsC) {
		this.idDetailsC = idDetailsC;
	}

	public CommandModel getCommand() {
		return command;
	}

	public void setCommand(CommandModel command) {
		this.command = command;
	}

	public ProductModel getProduct() {
		return product;
	}

	public void setProduct(ProductModel product) {
		this.product = product;
	}

	public double getQuantite() {
		return quantite;
	}

	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "DetailsCommandModel [idDetailsC=" + idDetailsC + ", command=" + command + ", product=" + product
				+ ", quantite=" + quantite + ", prix=" + prix + "]";
	}
	
	

	
	
	
}
