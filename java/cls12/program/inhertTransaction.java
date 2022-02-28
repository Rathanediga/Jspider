class Account{
	public static void check(){
		long accno=9461325312866l;
		double bal=69325.316;
		System.out.println(" your accno is = "+accno+" :  balance is"+bal);

	}

}

class transaction extends Account{
	public static void checkbal(){
		System.out.println("dear customer");		

	}

}


class inhertTransaction{
	public static void main(String[] args) {
		transaction t=new transaction();
		t.checkbal();
		t.check();


		// Account a=new Account();
		// a.check();
		// transaction t=new transaction();
		// t.checkbal();
		
	}
}