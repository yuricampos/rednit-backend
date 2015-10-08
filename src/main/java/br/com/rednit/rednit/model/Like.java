package br.com.rednit.rednit.model;

import org.hibernate.annotations.GenericGenerator;

import java.time.Instant;

import javax.persistence.*;

@Entity
public class Like {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;

    @ManyToOne
	private FacebookAccount account;

    @ManyToOne
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