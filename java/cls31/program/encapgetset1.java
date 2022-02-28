package com.jspiders.java;

class account{
	private double bal;

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}
	
}

class transaction extends account{
	public static void deposit(double amt,account a1) {
		double d= a1.getBal();
		d=d+amt;
		a1.setBal(d);
	}
	public static void withdraw( double amt, account a1) {
		double d=a1.getBal();		
		d=d-amt;
		a1.setBal(d);
		
	}
	public static void checkbal(account a1) {
		System.out.println(a1.getBal());
	
	}
}
public class encapgetset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		account a1=new account();
		transaction.checkbal(a1);
		transaction.deposit(15000,a1);
		transaction.deposit(5000,a1);
		transaction.checkbal(a1);		
		transaction.withdraw(5000,a1);
		transaction.checkbal(a1);

	}

}
