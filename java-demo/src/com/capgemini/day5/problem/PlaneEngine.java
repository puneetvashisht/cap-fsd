package com.capgemini.day5.problem;

public class PlaneEngine extends Engine {
	
	int burst;

	public PlaneEngine(String make, int burst) {
		super(make);
		this.burst = burst;
	}

	@Override
	public String toString() {
		return "PlaneEngine [burst=" + burst + ", make=" + make + "]";
	}
	
	

}
