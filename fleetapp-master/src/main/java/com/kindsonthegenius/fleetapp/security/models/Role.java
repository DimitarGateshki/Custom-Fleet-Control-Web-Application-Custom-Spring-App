package com.kindsonthegenius.fleetapp.security.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private String details;
	public Integer getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}
}
