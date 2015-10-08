package br.com.rednit.rednit.model;

import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Account<TAccount extends Account<? super TAccount>> {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private User user;

    @ManyToMany
    private Set<TAccount> myFriends;

    @ManyToMany(mappedBy = "myFriends")
    private Set<TAccount> friendsOfMe;

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Set<TAccount> getMyFriends() {
        return myFriends;
    }

    public Set<TAccount> getFriendsOfMe() {
        return friendsOfMe;
    }

}