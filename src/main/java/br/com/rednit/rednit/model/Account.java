package br.com.rednit.rednit.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import br.com.rednit.rednit.model.User;

@Entity
public abstract class Account<TAccount extends Account<? super TAccount>> {
	
	private int id;
	
	private User user;
	
	private Set<Friend<TAccount>> friends;

	@Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
	public int getId() {
		return id;
	}

	@ManyToOne
	public User getUser() {
		return user;
	}

	@OneToMany(mappedBy = "friend1")
	@OneToMany()
	public Set<Friend<TAccount>> getFriends() {
		return friends;
	}
	
}