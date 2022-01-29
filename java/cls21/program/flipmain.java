abstract class flipcart{
	abstract public void login();
	abstract public void logout();

}

class admin extends flipcart{
	@Override
	public void login(){
		System.out.println("admin login done");
	}

	public void logout(){
		System.out.println("admin logout done");
	}


}

class customer extends flipcart{
	@Override
	public void login(){
		System.out.println("customer login done");
	}

	public void logout(){
		System.out.println("customer logout done");
	}

}

class flipmain{
	public static void main(String[] args) {
		// flipcart f1=new flipmain();
		customer cs=new customer();
		cs.login();
		cs.logout();
		admin am=new admin();
		am.login();
		am.logout();
		
	}
}