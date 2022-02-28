class sample{
	public void test(int a,int b){
		System.out.println(a+b);
	}
}

class demo extends sample{
	 
	public void view(){
		super.test(5,8);
		System.out.println("view done");
	}
}


class supkew{
	public static void main(String[] args) {
		demo d=new demo();
		d.view();

		
	}
}