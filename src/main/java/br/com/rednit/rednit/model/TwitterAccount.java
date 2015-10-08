package br.com.rednit.rednit.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"twitterId"})})
public class TwitterAccount extends Account<TwitterAccount> {

	private long twitterId;

    @ManyToMany
	private Set<Tweet> favorites;

	public long getTwitterId() {
		return twitterId;
	}

	public Set<Tweet> getFavorites() {
		return favorites;
	}
	
}
