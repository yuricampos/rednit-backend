package br.com.rednit.rednit.model;

import java.util.Set;

import javax.persistence.Entity;

@Entity
public class TwitterAccount extends Account<TwitterAccount> {

	private long twitterId;
	
	private Set<Favorite> favorites;

	public long getTwitterId() {
		return twitterId;
	}

	public Set<Favorite> getFavorites() {
		return favorites;
	}
	
}
