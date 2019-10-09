package com.ruby.java.ch07.inheritance;

public class Employee extends Person{

	private String dept;
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return super.toString() + " : " + getDept();
	}
	
	public Employee() {
		super();
		System.out.println("Employee 积己磊 角青!");
	}
	
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
		System.out.println("Employee(name. age, dept) 积己磊 角青!");
	}
}
