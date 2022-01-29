class overloaad
{
	public void meth1(){
		System.out.println("meth1 done");
	}

	public void meth1(int g){
		System.out.println(g);
	}

	public void meth1(float s,int h){
		System.out.println(s+h);
	}

	public void meth1(double i,float t){
		System.out.println(i-t);
	}
}
class methover{
	public static void main(String[] args) {
		overloaad m1=new overloaad();
		m1.meth1();
		m1.meth1(2);
		m1.meth1(5.8f,8);
		m1.meth1(435.386,2.3f);		
	}
}