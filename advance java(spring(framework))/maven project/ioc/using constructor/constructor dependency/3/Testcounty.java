package com.jspiders.mavenproject10;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testcounty {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext t1=new ClassPathXmlApplicationContext("com/jspiders/mavenproject10/config.xml");
		Country c1=(Country) t1.getBean("test");
		System.out.println(c1);
		
		Map<String,String> c2=c1.statesandlanguage;
		System.out.println(c2.getClass());
	}

}
