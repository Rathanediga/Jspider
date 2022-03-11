package com.jspiders.mavenproject09;

import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestShelter {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext tt= new ClassPathXmlApplicationContext("com/jspiders/mavenproject09/config.xml");
		Shelter s11=(Shelter) tt.getBean("test");
		System.out.println(s11);
		Set<String> s12=s11.district;
		System.out.println(s12.getClass());
	}

}
