package com.capgemini.day2.pojo;

public class Box {
	
	private static int count;
	
	private String color; 
	
	//fields
	private double height;
	private double width;
	private double depth;
	
	
	//constructor
	public Box(double height, double width, double depth, String color) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
		this.color = color;
	}
	
	public Box() {
		super();
	}

	//method
	
	public double area() {
		double area = this.height * width;
		return area;
	}
	
	public void doubleHeight() {
	
		this.height *= 2; 
	}
	
	//public get/sets
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	
	@Override
	public String toString() {
		return "Box [height=" + height + ", width=" + width + ", depth=" + depth + "]";
	}

	
	
	
	
	

}
