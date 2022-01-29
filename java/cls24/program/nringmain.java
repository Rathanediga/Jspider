class nringmain{
	public static void main(String[] args) {
		// widning
		int a=5;//32 bit
		System.out.println(a);
		float b=a;//64 bit
		System.out.println("widing : "+b);

		// narrowing
		float h=65.62f;
		System.out.println(h);
		int l=(int)h;//casting using datatype
		System.out.println("narrowing : "+l);

	}
}