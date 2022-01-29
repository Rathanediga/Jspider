interface user{
	public void login();
	public void logout();
}

class zomato implements user{
	@Override
	public void login(){
		System.out.println("login at zomato done...");
	}

	@Override
	public void logout(){
		System.out.println("logout at zomato done...");
		System.out.println();
	}	
}

class swiggy implements user{
	@Override
	public void login(){
		System.out.println("login at swiggy done...");
	}

	@Override
	public void logout(){
		System.out.println("logout at swiggy done...");
		System.out.println();
	}	
}


class userintrfce{
	public static void main(String[] args) {
		// sample s8;
		zomato zo=new zomato();
		zo.login();
		zo.logout();

		swiggy sw=new swiggy();
		sw.login();
		sw.logout();

		
	}
}