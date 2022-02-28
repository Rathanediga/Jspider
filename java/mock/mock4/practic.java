class practic0 extends a{
	public  void match() {
		System.out.println("match done");
		
	}

	
}

class practic1 extends a{
	public  void test() {
		System.out.println("test done");
		
		
	}


	
}






// class practic11 extends practic1{
// 	public  void rcb() {
// 		System.out.println("rcb done");
		
		
// 	}
	

	
// }



class practic2 extends practic0{
	public  void win() {
		System.out.println("win done");
		
		
	}
}




class practic {
	public static void main(String[] args) {
		practic2 d1=new practic2();
		// practic11 d2=new practic11();
		d1.match();
		// d2.rcb();
		d1.win();
	
		
	}
}