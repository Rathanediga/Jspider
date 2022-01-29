class sample{
	final int a=5;
	String b="shimoga";
	public void test(){
		System.out.println("test() excicuted");

	}

	public void demo(){
		System.out.println("demo() excicuted");

	}

}

class subsample extends sample{
	float n=5.6f;
	public static void count(){
		System.out.println("count() excicuted");		

	}

}




class Empire{
	public static void main(String[] args) {
		subsample t=new subsample();
		System.out.println(t.n);
		t.count();
		t.demo();
		System.out.println(t.a);
		System.out.println(t.b);

		
		
		
	}
}