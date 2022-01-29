interface transaction{
	public void pay();
	public void chechBal();

}

class upi implements transaction{
	public void pay(){
		System.out.println("upi pay done");
	}
	public void chechBal(){
		System.out.println("upi chechBal done");
	}

}

class atm implements transaction{
	public void pay(){
		System.out.println("atm pay done");
	}
	public void chechBal(){
		System.out.println("atm chechBal done");
	}

}//object implementation layer


class bank{
	public static transaction ammount(String rst){
		transaction t1=null;
		if(rst.equalsIgnoreCase("upi")){
			t1=new upi();//upcasting
		}
		else{
			t1=new atm();
		}
		return t1;

	}
}

//object creation layer
class mainAbstracton2{
	public static void main(String[] args) {
		transaction ref=bank.ammount("upi");
		ref.pay();
		ref.chechBal();
	}
}