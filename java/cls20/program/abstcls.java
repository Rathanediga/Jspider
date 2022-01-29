abstract class sample{
	abstract public void test();
		abstract public void match();
		public static void win() {
			System.out.println("match win");
			
		}

}

class demo extends sample{
	 @Override
	public void test(){
		System.out.println("overridden the second test");
	}

	public void match(){
		System.out.println("overridden the match");
	}
}


class abstcls{
	public static void main(String[] args) {
		sample r; //=new sample();
		demo d=new demo();
		d.test();
		d.match();

		sample.win();
		
	}
}