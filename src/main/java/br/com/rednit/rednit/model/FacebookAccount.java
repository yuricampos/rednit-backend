package br.com.rednit.rednit.model;

import org.hibernate.annotations.GenericGenerator;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"facebookId"})})
public class FacebookAccount extends Account<FacebookAccount> {

    private String facebookId;

	@OneToMany(mappedBy = "account")
	private Set<Like> likes;

	public String getFacebookId() {
		return facebookId;
	}

	public Set<Like> getLikes() {
		return likes;
	}
	
}