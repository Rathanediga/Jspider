interface RUN1{
	public void test();
	public default void match(){
		System.out.println("match done");
	}
	
}

interface RUN2{	
	public void display();
	public static void view(){
		System.out.println("view done");
	}
}

class Demo implements RUN1,RUN2{
	@Override
	public void test(){
		System.out.println("test done...");
	}

	@Override
	public void display(){
		System.out.println("display done...");
		
	}	
}

class appintrfce{
	public static void main(String[] args) {
		// RUN1 r1;

		Demo zo=new Demo();
		zo.match();
		zo.test();
		zo.display();
		RUN2.view();
		
	}
}