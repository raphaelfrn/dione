package com.dione.model;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="user")
public class UserModel {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="id_user")
	private Long idUser;
	private String lastname;
	private String firstname;
	@Column(name="inscription_date")
	private Date inscriptionDate;
	private String email;
	private String telephone;
	private String password;
	
	@OneToMany(mappedBy="idCommand",cascade = CascadeType.ALL)
	private Collection<CommandModel> commandes;
	
	public UserModel() {
	}

	public UserModel(Long idUser, String lastname, String firstname, Date inscriptionDate, String email,
			String telephone, String password) {
		this.idUser = idUser;
		this.lastname = lastname;
		this.firstname = firstname;
		this.inscriptionDate = inscriptionDate;
		this.email = email;
		this.telephone = telephone;
		this.password = password;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public Date getInscriptionDate() {
		return inscriptionDate;
	}

	public void setInscriptionDate(Date inscriptionDate) {
		this.inscriptionDate = inscriptionDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserModel [idUser=" + idUser + ", lastname=" + lastname + ", firstname=" + firstname
				+ ", inscriptionDate=" + inscriptionDate + ", email=" + email + ", telephone=" + telephone
				+ ", password=" + password + "]";
	}
	
	
	
	
	
	
}
