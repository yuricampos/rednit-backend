package br.com.rednit.rednit.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.vividsolutions.jts.geom.Point;
import org.hibernate.annotations.Type;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	private String email;
	
	@SuppressWarnings("rawtypes")
	private Set<Account> accounts;

    @Type(type="org.hibernate.spatial.GeometryType")
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