class test{
	public void run(){
		System.out.println("run done");

	}
	public void run(int a){
		System.out.println(a);
		
	}
}

class sample extends test{
	public void run(double a,float b){
			System.out.println(a+b);
		}

	public static void main(String[] args) {
	sample s1=new sample();
	s1.run();
	s1.run(5);
	s1.run(5.235,5.8f);		
	}	

}