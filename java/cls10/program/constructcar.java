class constructcar{

	double price;
	String brand;
	String number;

	public constructcar(double price1,String brand1,String number){
		price=price1;
		brand=brand1;
		this.number=number;
		
	}

	public void test1(){
		System.out.println("price :" + price);
		System.out.println("brand :" + brand);
		System.out.println("number :" + number);
	}

	public static void main(String[] args) {
		constructcar rst=new constructcar(8000000,"Audi","KA19P8596");
		rst.test1();
		constructcar rst1=new constructcar(5000000,"Bently","KA19P3164");
		rst1.test1();
	}
}