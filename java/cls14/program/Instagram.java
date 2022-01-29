class Instagram1{
	public static void Filter(){
		System.out.println("enjoy the Filters");

	}

}

class Instagram2 extends Instagram1{
	public static void FingerPrint(){
		System.out.println("added a new FingerPrint");		

	}

}


class Instagram3 extends Instagram2{
	public static void Post(){
		System.out.println("post a new Picture");		

	}

	public static void Like(){
		System.out.println("like the Posts");		

	}

}


class Instagram{
	public static void main(String[] args) {
		Instagram3 t=new Instagram3();
		t.Filter();
		t.FingerPrint();
		t.Like();
		t.Post();


		
		
	}
}