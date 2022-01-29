package com.jspiders.java;

import java.util.Objects;

class employee extends Object{
	String name;
	double salary;
	int id;
	public employee(String ename,double esal,int eid) {
		super();
		this.name=ename;
		this.salary=esal;
		this.id=eid;
	}
	
	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", salary=" + salary + ", id=" + id + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.hashCode()==obj.hashCode();
	}
	
}
public class empmain1 {

	public static void main(String[] args) {
		employee e1=new employee("Rathan",85000,5);
		employee e12=e1;
		employee e2=new employee("kiran",35000,8);
		System.out.println(e1.hashCode());
		System.out.println(e1.toString());
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e12));

		
		
	}

}
