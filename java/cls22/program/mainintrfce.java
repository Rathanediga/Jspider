interface sample{
	public void test();
	public void match();
}

class demo implements sample{
	@Override
	public void test(){
		System.out.println("test done...");
	}

	@Override
	public void match(){
		System.out.println("match done...");
	}	
}



class mainintrfce{
	public static void main(String[] args) {
		sample s8;
		demo d5=new demo();
		d5.test();
		d5.match();
	}
}