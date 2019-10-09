package com.ruby.java.ch06;

public class StaticblockTest {

	static {
		System.out.println("hello");
		System.out.println("java");
	} //먼저 처리해야하는 작업을 정적코드 블록에 작성 -> main() 보다 먼저 실행
	
	public static void main(String[] args) {
		
		System.out.println("world!!");
	}
}
