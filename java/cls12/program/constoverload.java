class constoverload{
	public constoverload(){
		System.out.println("constoverload done");
	}

	public constoverload(int a){
		System.out.println("a ="+ a);
	}

	public constoverload(int a,double b){
		System.out.println(a+b);
	}

	public constoverload(double a,int b){
		System.out.println(a-b);
	}

	public constoverload(long a,float b){
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		new constoverload();
		new constoverload(5);
		new constoverload(58,5.31648);
		new constoverload(68.31642,6);
		new constoverload(686435l,6.8f);
		new constoverload(96435l,35.8f);
		
	}
}