package com.kindsonthegenius.fleetapp.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import com.kindsonthegenius.fleetapp.security.models.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {		
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
	private int id;
    private String firstname;
    private String lastname;
	private String username;
	private String password;
	

	@ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")}
    )
	Set<Role> roles = new HashSet<>();

	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return this.username;
	}

	public Set<Role> getRoles() {
		// TODO Auto-generated method stub
		return this.roles;
	}

	public void setPassword(String encode) {
		// TODO Auto-generated method stub
		this.password=encode;
	}

	public void setRoles(Set<Role> userRoles) {
		// TODO Auto-generated method stub
		this.roles=userRoles;
		
	}

	public Integer getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public void setUsername(String username2) {
		this.username=username2;
		
	}
	
}
