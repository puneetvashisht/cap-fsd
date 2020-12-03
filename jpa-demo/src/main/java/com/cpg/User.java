package com.cpg;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Transient;

@Entity
@NamedQuery(name = "selectCount", query = "SELECT count(u) FROM User u")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	@Column(name = "user_email")
	String email;
	String password;
	double rating;
	boolean active;
	
	@Transient
	String confirmPassword;
	
	public User() {}
	public User(String name, String email, String password, double rating, boolean active) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.rating  = rating;
		this.active = active;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
//	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", rating="
				+ rating + "]";
	}
	
	
	

}
