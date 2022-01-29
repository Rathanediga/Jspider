package com.jspiders.java;

public class excptonmain1 {

	public static void test(int a) {
		try {
		int c=a/0;
		System.out.println(c);
	
	}
	catch (Exception c) {
		System.out.println("catch block excexuted");
	}
		finally {
			System.out.println("finally block excexuted");			
		}
		
	}

	public static void excmain1(String[] args) {
		test(50);

	}

}


