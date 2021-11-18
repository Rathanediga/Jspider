class Demo22{
	public static void test() {
		System.out.println("mothod test() is excecuted");
		match();
	}

	public static void match() {
		System.out.println("mothod match() is excecuted");
	}
}


class Demo2{
	public static void main(String[] args) {
		Demo22.test();
	}
}