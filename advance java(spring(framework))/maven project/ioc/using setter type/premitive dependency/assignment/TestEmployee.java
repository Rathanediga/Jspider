package com.jspiders.mavenproject1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext rcb=new ClassPathXmlApplicationContext("com/jspiders/mavenproject1/config.xml");
		employee e1=(employee) rcb.getBean("rst");
		System.out.println(e1);
	}

}
