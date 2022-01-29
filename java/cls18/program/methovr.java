class fisher{
	public void fish(){
		System.out.println("print fish done");
	}

	public void fish(int a,int b){
		System.out.println(a+b);
	}

	public void fish(float a, long b){
		System.out.println(b-a);
	}

}


class methovr{
	public static void main(String[] args) {
		fisher f=new fisher();
		f.fish();
		f.fish(5,8);
		f.fish(5.5f,34682l);
		
	}
}