package com.jspiders.java;

import java.util.ArrayList;
import java.util.HashSet;

public class collarrlistt {

	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		a1.add(5);
		a1.add(6.8);
		a1.add(8);
		a1.add("rst");
		a1.add(6.8);
		System.out.println(a1);//default const
		
		HashSet hs= new HashSet(a1);
		System.out.println(hs);//constructor c

	}

}
