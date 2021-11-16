class Bird{
	static int r=58;//static data member

	public static void eat() {
		System.out.println("food");		
	}

	public static void color() {
		System.out.println("red");		
	} 

	public static void main(String[] args) {
		
		String s="jnnce";
		System.out.println(r);
		System.out.println(s);
		eat();
		color();
	}
}