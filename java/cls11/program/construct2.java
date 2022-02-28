class construct2{

	String name;
	int accno;
	String email;

	public construct2(String name1,int accno1,String email1){
		name=name1;
		accno=accno1;
		email=email1;

		System.out.println("name :" + name);
		System.out.println("accno :" + accno);
		System.out.println("email :" + email);
		
	}

	

	public static void main(String[] args) {
		construct2 rst=new construct2("Rathanediga",21252830,"rathanediga08@gmail.com");
		
		construct2 rst1=new construct2("Rathan",2125,"rathanediga08@gmail.com");
		
	}
}








/*
class construct2{

	

	public construct2(String name1,int accno1,String email1){
		System.out.println("name :" + name1);
		System.out.println("accno :" + accno1);
		System.out.println("email :" + email1);
				
	}

	

	public static void main(String[] args) {
		new construct2("Rathanediga",21252830,"rathanediga08@gmail.com");
		new construct2("Ratha",210,"rathanediga08@gmail.com");
		
	}
}
*/