package com.jspiders.mavenproject4;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCountry {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext m1=new ClassPathXmlApplicationContext("com/jspiders/mavenproject4/config.xml");
		Country c1=(Country) m1.getBean("test5");
		System.out.println(c1);
		
		Map<String,String> ms= c1.getStateandlanguage();
		System.out.println(ms.getClass());
	}

}
