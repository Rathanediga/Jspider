// class sample{
// 	public void test(){
// 		System.out.println("test done");
// 	}
// }

// class demo extends sample{
// 	public void display(){
// 		System.out.println("display done");
// 	}
// }

// class dncstmain{
// 	public static void main(String[] args) {
// 		sample s1=new demo();
// 		demo d1=(demo)s1;
// 		d1.test();
// 		d1.display();
		
// 	}
// }



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

class run extends sample{
	public void view(){
		System.out.println("view done");
	}
}

class dncstmain{
	public static void main(String[] args) {
		sample s1=new run();
		run d1=(run)s1;
		// run d1=(run)s1;
		d1.test();
		d1.view();
		
	}
}