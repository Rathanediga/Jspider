package com.jspiders.mavenproject7;

public class Employee {
	public Employee(int rmpid, String empname, double salary) {
		super();
		this.rmpid = rmpid;
		this.empname = empname;
		this.salary = salary;
	}
	private int rmpid;
	private String empname;
	private double salary;
	public int getRmpid() {
		return rmpid;
	}
	public void setRmpid(int rmpid) {
		this.rmpid = rmpid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [rmpid=" + rmpid + ", empname=" + empname + ", salary=" + salary + "]";
	}
	
	

}
