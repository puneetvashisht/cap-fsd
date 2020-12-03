package com.cpg.compose;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	int houseNumber;
	String locality;
	String city;
	
	
	public Address() {
		
	}
	public Address(int houseNumber, String locality, String city) {
		super();
		this.houseNumber = houseNumber;
		this.locality = locality;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", locality=" + locality + ", city=" + city + "]";
	}
	
	

}
