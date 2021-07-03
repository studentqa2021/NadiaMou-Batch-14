package com.baseLogin;

public class ExceptionsPractice {
	
	static int b = 10;
	static int c= 15;
public static void main(String[] args) {
	ExceptionsPractice.getExceptions();
}
	public static void getExceptions () {
		System.out.println(b);//10
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(10/0);// 
		System.out.println(c);//15
	}
	
}
