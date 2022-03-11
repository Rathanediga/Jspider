package com.jspiders.mavenproject7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1= new ClassPathXmlApplicationContext("com/jspiders/mavenproject7/config.xml");
		Employee e1=(Employee) c1.getBean("test");
		System.out.println(e1);
	}

}
