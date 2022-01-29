interface Transfer{
	static long a=5000;	
	public void history();
	public default void send(){		
		System.out.println("transfer money upto Rs 100000");
		System.out.println("You transfering of rs "+ a);
		System.out.println();
	}
	
}

interface Recieve extends Transfer{	
	
	public void balance();
	public static void ask(){	
	// long a=5000;	
		System.out.println("you recieved money of rs "+ a);
		System.out.println();
	}
}

class account implements Transfer,Recieve{
	static int b=63;
	@Override
	public void history(){
		System.out.println("	Your Transaction History");
		System.out.println("1000rs debited");
		System.out.println("2500rs credited");
		System.out.println("1800rs credited");
		System.out.println("5063rs credited");
		System.out.println();
	}

	@Override
	public void balance(){
		System.out.println("Your Acc's avilable bal is " + (a+b));
		System.out.println();
		
	}	
}

class googlePay{
	public static void main(String[] args) {
		account ac=new account();
		ac.history();
		ac.balance();	
		ac.send();
		Recieve.ask();


	}
}