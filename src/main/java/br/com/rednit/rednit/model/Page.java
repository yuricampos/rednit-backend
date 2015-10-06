package br.com.rednit.rednit.model;

import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Page {

	private int id;
	
	private String facebookId;
	
	private String name;
	
	private String about;
	
	private Set<Like> likes;

	public int getId() {
		return id;
	}

	public String getFacebookId() {
		return facebookId;
	}

	public String getName() {
		return name;
	}

	public String getAbout() {
		return about;
	}

	public Set<Like> getLikes() {
		return likes;
	}
	
}
