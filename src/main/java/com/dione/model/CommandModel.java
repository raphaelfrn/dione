package com.dione.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CommandModel {

	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="id_command")
	private Long idCommand;
	private UserModel user;
	private Date dateC;
	private double total;
	
	public CommandModel() {
	}

	public CommandModel(Long idCommand, UserModel user, Date dateC, double total) {
		this.idCommand = idCommand;
		this.user = user;
		this.dateC = dateC;
		this.total = total;
	}

	public Long getIdCommand() {
		return idCommand;
	}

	public void setIdCommand(Long idCommand) {
		this.idCommand = idCommand;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public Date getDateC() {
		return dateC;
	}

	public void setDateC(Date dateC) {
		this.dateC = dateC;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "CommandModel [idCommand=" + idCommand + ", user=" + user + ", dateC=" + dateC + ", total="
				+ total + "]";
	}
	
	
	
}
