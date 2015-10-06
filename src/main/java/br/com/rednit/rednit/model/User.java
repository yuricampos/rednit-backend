package br.com.rednit.rednit.model;

import java.util.Set;

import javax.persistence.Entity;

import com.vividsolutions.jts.geom.Point;

@Entity
public class User {
	
	private int id;
	
	private String email;
	
	@SuppressWarnings("rawtypes")
	private Set<Account> accounts;
	
	private Point location;	 
	
	private String photoUrl;

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	@SuppressWarnings("rawtypes")
	public Set<Account> getAccounts() {
		return accounts;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}
}