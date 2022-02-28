class sample extends Object{
	public sample(int a){
		super();
		System.out.println(a);
	}
}

class demo extends sample{
	public demo(){
		super(5);
		System.out.println("demo done");
	}
}






class test88 extends Object{
	public static void main(String[] args) {
		demo d=new demo();

		
	}
}