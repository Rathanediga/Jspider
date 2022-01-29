class wgnnormain{
	public static void main(String[] args) {
		// widning
		char a='r';//32 bit
		System.out.println(a);
		int b=a;//64 bit
		System.out.println("widing : "+b);

		// narrowing
		int h=65;
		System.out.println(h);
		char l=(char)h;//casting using datatype
		System.out.println("narrowing : "+l);

	}
}