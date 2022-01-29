interface twitter{
	public void chat();
	public default void share(){
		System.out.println("share done");
	}
	public static void comment(){
		System.out.println("comment done");
	}	
}

interface twitter2 extends twitter{	
	public void hide();
	
}

class Demo implements twitter2{
	@Override
	public void hide(){
		System.out.println("hide done...");
	}

	@Override
	public void chat(){
		System.out.println("chat done...");		
	}	
}

class appmultlvlintrfce{
	public static void main(String[] args) {
		
		Demo t=new Demo();
		t.share();
		twitter.comment();
		t.hide();
		t.chat();		
	}
}