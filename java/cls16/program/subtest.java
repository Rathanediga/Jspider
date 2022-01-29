class sample{
	public sample(int s){
		System.out.println("sample done");
		System.out.println(s);

	}

}

class demo extends sample{
	public demo(){
		super(5);
		System.out.println("demo done");		

	}

}





class subtest{
	public static void main(String[] args) {
		demo d= new demo();

		

		
		
	}
}