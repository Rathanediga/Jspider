class sample{
	public void demo1(){
		System.out.println("domo1 done");
		demo2();
	}

	public static void demo2(){
		System.out.println("domo2 done");
	}


}


class test58{
	public static void main(String[] args) {

		sample s1=new sample();
		sample s2=new sample();
		s1.demo1();
		s2.demo1();

		

		
	}

}