package br.com.rednit.rednit.model;

import java.time.Instant;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"twitterId"})})
public class Tweet {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private long twitterId;
	
	private String text;
	
	private Instant createdAt;

    @ManyToMany(mappedBy = "favorites")
	private Set<TwitterAccount> favorites;

	public long getId() {
		return id;
	}

	public long getTweeterId() {
		return twitterId;
	}

	public String getText() {
		return text;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public Set<TwitterAccount> getFavorites() {
		return favorites;
	}
}
