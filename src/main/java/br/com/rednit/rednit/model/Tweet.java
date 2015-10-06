package br.com.rednit.rednit.model;

import java.time.Instant;
import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Tweet {

	private long id;
	
	private long tweeterId;
	
	private String text;
	
	private Instant createdAt;
	
	private Set<Favorite> favorites;

	public long getId() {
		return id;
	}

	public long getTweeterId() {
		return tweeterId;
	}

	public String getText() {
		return text;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public Set<Favorite> getFavorites() {
		return favorites;
	}
	
}
