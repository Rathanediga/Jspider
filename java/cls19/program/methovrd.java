class sample{
	public void test(){
		for (int i=0;i<=5 ;i++ ) {
			System.out.println(i);
			
		}
	}
}

class demo extends sample{
	 @Override
	public void test(){
		for(int j=5;j>0 ;j--) {
			System.out.println(j);
			
		}
	}
}


class methovrd{
	public static void main(String[] args) {
		demo d=new demo();
		d.test();
		
	}
}