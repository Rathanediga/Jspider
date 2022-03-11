package com.jspiders.mavenproject2;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext rst=new ClassPathXmlApplicationContext("com/jspiders/mavenproject2/config.xml");
				Student s1=(Student) rst.getBean("test");
		System.out.println(s1);
		
		List<String> s2=s1.getSubjects();
		System.out.println(s2.getClass());
	}

}
