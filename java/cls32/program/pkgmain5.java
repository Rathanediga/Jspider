package com.jspiders.java;

public class pkgmain5 {

	public static void main(String[] args) {
		Object obj= new Object();
		int i=obj.hashCode();
		System.out.println(i);
		Object i1=obj;
		System.out.println(i1.hashCode());
		
		Object obj1=new Object();
		int i2=obj1.hashCode();
		System.out.println(i2);
		
		String s=obj.toString();
		System.out.println(s);
		
		System.out.println(obj1);
		
		System.out.println(obj.equals( i1));
		System.out.println(obj.equals( obj1));
	}

}
