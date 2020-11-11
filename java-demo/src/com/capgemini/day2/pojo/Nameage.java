package com.capgemini.day2.pojo;

public class Nameage {
	String ename;
    int age;
    static int count;
    
    
	public Nameage() {
		super();
	}
	public Nameage(String ename, int age) {
		super();
		this.ename = ename;
		this.age = age;
		count++;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Nameage [ename=" + ename + ", age=" + age + "]";
	}
    
	
	protected void finalize() {
		System.out.println("destroy object...");
		this.age = 0;
		this.ename = null;
//		this.connection.close();
	}
    

}
