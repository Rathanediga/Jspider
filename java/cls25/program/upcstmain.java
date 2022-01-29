class sample{
	public void test(){
		System.out.println("test done");
	}
}

class demo extends sample{
	public void display(){
		System.out.println("display done");
	}
}

class upcstmain{
	public static void main(String[] args) {
		sample s1=new demo();
		s1.test();
		// s1.display();
		
	}
}