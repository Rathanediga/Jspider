class methoods2{
	public static double test(double a, double pi,int r) {
		double sphere=a*pi*r*r*r;
		return sphere;
		
	}
	public static void main(String[] args) {
		System.out.println(test(1.333,3.142,5));
		System.out.println(test(1.333,3.142,6));
		System.out.println(test(1.333,3.142,7));
		
	}
}