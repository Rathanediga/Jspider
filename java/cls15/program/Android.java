class MI{
	public  void Filter(){
		System.out.println("enjoy the Filters");

	}

}

class OPPO extends MI{
	public  void Filter(){
		System.out.println("enjoy the Filters");

	}

	public  void FingerPrint(){
		System.out.println("added a new FingerPrint");		

	}

}


class ONEPLUS extends MI{
	public  void Filter(){
		System.out.println("enjoy the Filters");

	}

	public  void Like(){
		System.out.println("like the Posts");		

	}

}


class Android{
	public static void main(String[] args) {
		OPPO t=new OPPO();
		t.Filter();
		t.FingerPrint();
		// t.Like();
		


		
		
	}
}