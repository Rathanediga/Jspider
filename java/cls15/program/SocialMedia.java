class Flipcart{
	public  void Login(){
		System.out.println("u have logged in");

	}

	public  void Logout(){
		System.out.println("u have logged out");

	}

}

class Cloths extends Flipcart{
	public  void Traditional(){
		System.out.println("enjoy with traditional");

	}

	public  void Western(){
		System.out.println("enjoy with western");		

	}

}


class Electronics extends Flipcart{
	public  void Laptop(){
		System.out.println("laptop ordered");

	}

	public  void Homeappliances(){
		System.out.println("home appliances ordered");		

	}

}

class Mobile extends Electronics{
	public  void MI(){
		System.out.println("order MI mobile");

	}

	public  void Samsung(){
		System.out.println("order MI mobile");

	}

	public  void Oneplus(){
		System.out.println("order MI mobile");

	}

}



class Groceries extends Flipcart{
	public  void Sancks(){
		System.out.println("snacks ordered");

	}

	public  void veg(){
		System.out.println("vegetables ordered");		

	}

}


class SocialMedia{
	public static void main(String[] args) {
		Electronics t=new Electronics();
		t.Laptop();		

	    Mobile m=new Mobile();
	    m.Homeappliances();
	    m.MI();
	    m.Logout();
		// t.Like();
		


		
		
	}
}