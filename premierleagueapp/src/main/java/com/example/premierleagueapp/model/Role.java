package com.example.premierleagueapp.model;

import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name="role")
public class Role {

    @Id
    @Column(name = "id" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", unique = true)
    private String name;
    
    @OneToMany(mappedBy = "role")
    private List<User> users;

    public Role() {
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
   

}
