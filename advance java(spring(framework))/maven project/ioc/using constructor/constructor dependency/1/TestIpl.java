package com.jspiders.mavenproject8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIpl {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext rs1=new ClassPathXmlApplicationContext("com/jspiders/mavenproject8/config.xml");
		Ipl pp=(Ipl) rs1.getBean("test");
		System.out.println(pp);
	}

}
