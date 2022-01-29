interface user{
	public void login();
	public void logout();

}

class customer implements user{
	public void login(){
		System.out.println("customer login done");
	}
	public void logout(){
		System.out.println("customer logout done");
	}

}

class admin implements user{
	public void login(){
		System.out.println("admin login done");
	}
	public void logout(){
		System.out.println("admin logout done");
	}

}//object implementation layer

class service{
	public static user test(String rst){
		user u1=null;
		if(rst.equalsIgnoreCase("customer")){
			u1= new customer();//upcasting
		}
		else{
			u1=new admin();
		}
		return u1;

	}
}
//object creation layer
class mainAbstracton{
	public static void main(String[] args) {
		user ref=service.test("admin");
		ref.login();
		
	}
}