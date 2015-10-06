package br.com.rednit.rednit.model;

import java.util.Set;

import javax.persistence.Entity;

@Entity
public class FacebookAccount extends Account<FacebookAccount> {
	
	private String facebookId;
	
	private Set<Like> likes;

	public String getFacebookId() {
		return facebookId;
	}

	public Set<Like> getLikes() {
		return likes;
	}
	
}