package br.com.rednit.rednit.model;

import java.time.Instant;

import javax.persistence.Entity;

@Entity
public class Like {
	
	private int id;
	
	private FacebookAccount account;
	
	private Page page;
	
	private Instant likeInstant;

	public int getId() {
		return id;
	}

	public FacebookAccount getAccount() {
		return account;
	}

	public Page getPage() {
		return page;
	}

	public Instant getLikeInstant() {
		return likeInstant;
	}

}