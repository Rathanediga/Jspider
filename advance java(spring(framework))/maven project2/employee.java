package com.jspiders.mavenproject1;

public class employee {
	private int empid;
	private String empname;
	private long salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + "]";
	}
	
	

}
