package com.ruby.java.ch09;

public class Test07 {

	public static void main(String[] args) {
		String s = "�ѱ�,�Ϻ�,�߱�,�̱�,����,������";
		
		String list[] = s.split(",");
		String list2[] = s.split(",", 2);
		
		for(String item : list) {
			System.out.println(item);
		}
		
		System.out.println("=======================");
		
		for(String item : list2) {
			System.out.println(item);
		}
		System.out.println("=======================");
		
		String email = "purum@rubypaper.co.kr";
		int i = email.indexOf("@");
		
		String id = email.substring(0, i);
		String company = email.substring(i + 1);
		System.out.println(id);
		System.out.println(company);
		
		System.out.println("\n=======for Ȱ��========\n");

		for(int k = 0; k < list2.length; k++) {
			System.out.println(list2[k]);
		}
	}
}
