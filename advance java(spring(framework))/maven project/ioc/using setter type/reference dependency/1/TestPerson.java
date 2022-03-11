package com.jspiders.mavenproject6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext r1= new ClassPathXmlApplicationContext("com/jspiders/mavenproject6/config.xml");
		Persons p1=(Persons) r1.getBean("test");
		System.out.println(p1);
		
	}

}
