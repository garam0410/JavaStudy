package com.ruby.java.ch07.abstraction;

public class GalaxyMessenger implements Messenger, WorkFile{
	
	public String getMessage() {
		return "galaxy";
	}
	
	public void setMessage(String msg) {
		System.out.println("galaxy���� �޽����� �����մϴ�. : " + msg);
	}
	
	public void changeKeyboard() {
		System.out.println("Ű���� �������� ��ġ�� Ű���带 �����մϴ�.");
	}
	
	public void fileDownload() {
		System.out.println("������ �ٿ�ε��մϴ�.");
	}
	
	public void fileUpload() {
		System.out.println("������ ���ε��մϴ�.");
	}
}
