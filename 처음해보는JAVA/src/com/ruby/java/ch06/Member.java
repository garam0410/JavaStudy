package com.ruby.java.ch06;

public class Member {

	private String name;
	private int age;
	
	public Member() {
		this("Guest");
	}
	
	public Member(String name) {
		this(name, 0);
	}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ", " + age;
	}
	
	public static void main(String[] args) {
		Member m1 = new Member();
		Member m2 = new Member("Amy");
		Member m3 = new Member("Amy", 23);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}
	
	/*private String name;
	private int age;
	
	public Member() {
		System.out.println("Member() 积己磊 角青");
	}
	
	public Member(String name) {
		System.out.print("Member(String) 积己磊 角青 : ");
		System.out.println(name);
	}
	
	public Member(String name, int age) {
		System.out.print("Member(String, int) 积己磊 角青 : ");
		System.out.println(name + " + " + age);
		
	}
	
	public void setName(String name) {
		
	}
	
	public static void main(String[] args) {
		System.out.println("main() 概辑靛 角青");
		
		new Member();
		new Member("Amy");
		new Member("Amy", 23);
	}*/
}
