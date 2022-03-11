package com.jspiders.mavenproject3;

import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPlaces {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext rst=new ClassPathXmlApplicationContext("com/jspiders/mavenproject3/config.xml");
				Places s1=(Places) rst.getBean("test1");
		System.out.println(s1);
		
		Set<String> s2=s1.getTaluks();
		System.out.println(s2.getClass());
	}

}
