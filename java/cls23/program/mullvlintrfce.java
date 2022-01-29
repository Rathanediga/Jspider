interface instagram1{
	public void like();
	public default void fingerprint(){
		System.out.println("fingerprint done");
	}
	public static void videocall(){
		System.out.println("videocall done");
	}
	
}

interface instagram2 extends instagram1{	
	public void post();
	
}

class Demo implements instagram2{
	@Override
	public void post(){
		System.out.println("post done...");
	}

	@Override
	public void like(){
		System.out.println("like done...");
		
	}	
}

class mullvlintrfce{
	public static void main(String[] args) {
		
		Demo z=new Demo();
		z.fingerprint();
		instagram1.videocall();
		z.post();
		z.like();
		
		
	}
}