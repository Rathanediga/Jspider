class Demov{
	static int a=8;
	public void test() {
		int a=5;
		System.out.println(a);
		System.out.println(this.a);
		
	}

	int a1=88;
	public void test1() {
		int a1=55;
		System.out.println(a1);
		System.out.println(this.a1);
		
	}


	static int a2=98;
	public static void test2() {
		int a2=65;
		System.out.println(a2);
		System.out.println(Demov.a2);
		
	}


	 int a3=986;
	public static void test3() {
		int a3=650;
		System.out.println(a3);
		System.out.println(new Demov().a3);
		
	}

	

	public static void main(String[] args) {		
		Demov value=new Demov();
		value.test();
		new Demov().test1();
		test2();
		test3();
	}
}