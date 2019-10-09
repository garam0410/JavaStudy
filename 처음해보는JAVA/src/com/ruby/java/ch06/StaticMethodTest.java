package com.ruby.java.ch06;

public class StaticMethodTest {

	int num = 123;
	
	public static void main(String[] args) {
		StaticMethodTest.print1();
		StaticMethodTest exam = new StaticMethodTest();
		exam.print2();
	}
	
	public static void print1() {
		//int num2 = num; //오류 : static이 붙은 클래스 매서드이므로 main() 보다 먼저 실행됨 -> num이 생성되있지않음
		System.out.println("hello");
	}
	
	public void print2() {
		int num3 = num; // print2() 매소드를 실행하려면 인스턴스를 생성해야됨 -> 그때는 num이 선언된 이후라 오류가 안남
		System.out.println("java");
	}
}
