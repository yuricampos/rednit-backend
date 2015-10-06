package br.com.rednit.rednit.model;

import javax.persistence.Entity;

public class Favorite {
	
	private TwitterAccount account;
	
	private Tweet tweet;

	public TwitterAccount getAccount() {
		return account;
	}

	public Tweet getTweet() {
		return tweet;
	}

}
