class Account{
	static long actNo=3165286l;
	static double bal=69165;
	static String owner="Rathan Kumar HR";
	public  void deposite(){
		System.out.println(bal);
		
	}

	public  void withdraw(){
		System.out.println("start withdrawn the ammount");
		

	}

}

class Savings extends Account{
	public  void deposite(){
		double roi=6300.246;
		double p=roi+bal;
		System.out.println("you have deposited rs "+roi+" available bal is "+p);
		
	}

	
}

class Current extends Account{
	public  void show_minBal(){
		double min_bal=3000.00;
		System.out.println("you should maintain min bal of "+min_bal);
		
	}	

}

class Mainclass{
	public static void main(String[] args) {
		Current c= new Current();
		c.show_minBal();
		Savings rs=new Savings();
		rs.deposite();
		rs.withdraw();
		
	}
}