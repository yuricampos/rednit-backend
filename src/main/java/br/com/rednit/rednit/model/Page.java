package br.com.rednit.rednit.model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"facebookId"})})
public class Page {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;

	private String facebookId;
	
	private String name;
	
	private String about;

    @OneToMany(mappedBy = "page")
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
