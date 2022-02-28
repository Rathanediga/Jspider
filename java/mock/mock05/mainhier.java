class sample{
	public void test1(){
		System.out.println("test1 done");
	}
}


class demo extends sample{
	public void test2(){
		System.out.println("test2 done");
	}
}

class sub1 extends sample{
	public void test3(){
		System.out.println("test3 done");
	}
}



class mainhier{
	public static void main(String[] args) {
		sub1 s=new sub1();
		s.test3();
		s.test1();
		
	}
}