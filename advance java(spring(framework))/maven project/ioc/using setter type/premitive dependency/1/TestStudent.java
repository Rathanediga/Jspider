package com.jspiders.mavenproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/jspiders/mavenproject/rathan.xml"); //ctrl+space , ioc container , upcasting operation done here
	Student s1=(Student) context.getBean("demo");
	System.out.println(s1);
				
				
	}

}
