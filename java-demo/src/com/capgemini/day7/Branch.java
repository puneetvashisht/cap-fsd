package com.capgemini.day7;

public class Branch {

	int id;
	String location;
	boolean hasAtm;
	public Branch(int id, String location, boolean hasAtm) {
		super();
		this.id = id;
		this.location = location;
		this.hasAtm = hasAtm;
	}
	@Override
	public String toString() {
		return "Branch [id=" + id + ", location=" + location + ", hasAtm=" + hasAtm + "]";
	}
	
	
}
