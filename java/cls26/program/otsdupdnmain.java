interface user{
	public void login();
	public void logout();
}

class customer extends Object implements user{
	public void login(){
		System.out.println("customer login()");
	}
	public void logout(){
		System.out.println("customer logout()");
	}
}

class admin extends Object implements user{
	public void login(){
		System.out.println("admin login()");
	}
	public void logout(){
		System.out.println("admin logout()");
	}
}


class service{
	public static void test(Object o){
		if (o instanceof customer) {
			customer c1=(customer)o;
			c1.login();
			c1.logout();			
		}
		else{
			admin a1=(admin)o;
			a1.login();
			a1.logout();
		}

	}	
}

class otsdupdnmain{
	public static void main(String[] args) {
		customer c=new customer();
		admin a=new admin();
		service.test(c);

		
	}
}