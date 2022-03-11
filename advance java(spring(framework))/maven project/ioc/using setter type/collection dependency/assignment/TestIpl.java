package com.jspiders.mavenproject5;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIpl {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext i1= new ClassPathXmlApplicationContext("com/jspiders/mavenproject5/config.xml");
		ipl i2=(ipl) i1.getBean("test");
		System.out.println(i2);
		
		Map<String,String> mp=i2.getTeamandcolour();
		System.out.println(mp.getClass());
	}

}
