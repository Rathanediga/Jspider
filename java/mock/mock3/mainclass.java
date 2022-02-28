class heria1{
	final public void test1(){
		System.out.println("test1 done");
	}
}

class heria2 extends heria1{
	public void test2(){
		System.out.println("test2 done");
	}
}

class heria3 extends heria1{
	public void test3(){
		System.out.println("test3 done");
	}
}

class mainclass{
	public static void main(String[] args) {
		heria3 h1= new heria3();
		h1.test3();
		h1.test1();
		
	}
}