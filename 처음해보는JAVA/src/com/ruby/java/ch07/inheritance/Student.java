package com.ruby.java.ch07.inheritance;

public class Student extends Person{

	private String major;
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return super.toString() + " : " + getMajor();
	}
	
	public Student() {
		super();
		System.out.println("Student 积己磊 角青!");
	}
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
		System.out.println("Student(name, age, major) 积己磊 角青!");
	}
}
