class sample{
	public void test(){
		System.out.println("test() exicution done");
	}

	public void test(int a){
		System.out.println(a);
	}


	public void test(float b,long c){
		System.out.println(b+c);
	}

}


class methovrlodphly{
	public static void main(String[] args) {
		sample s=new sample();
		s.test();
		s.test(5);
		s.test(6.3f,6435l);
		
	}
}