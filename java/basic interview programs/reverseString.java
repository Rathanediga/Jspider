// using StringBuilder and StringBuffer it contain a method to reverse a string

class reverseString{
	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("rathan is a software engineer");
		System.out.println(str.reverse());


	}
}

System.out.println("-----------or---------------------");

class reverseString{
	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("0123456789");
		System.out.println(str.reverse());


	}
}


// using charAt() method in string

class reverseString{
	public static void main(String[] args) {
		String str="rcb for ever";
		String str1=" ";

		for (int i=str.length()-1;i>=0 ;i-- ) 
			{
				str1=str1+str.charAt(i);
			}	
			System.out.println(str1);
			
		


	}
}