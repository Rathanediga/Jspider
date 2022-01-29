package com.jspiders.java;

public class excptonmain {
	public static void test(int a) {
		try {
		int c=a/0;
		System.out.println(c);
	
	}
	catch (ArithmeticException c) {
		System.out.println("catch block excexuted");
	}
	}

	public static void excmain2(String[] args) {
		test(50);
		

	}

}
