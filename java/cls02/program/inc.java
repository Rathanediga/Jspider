// int u=5;
// int j=++u +4 u++ + ++u + ++u;
// 	6  +  4  +  10  +  12  +  13;
// 	= 45

// int k=8;
// int d=++k + ++k + k++ - ++k;
// 	9  +  10  +  10  -11;
// 	= 18

// int a=2; int b=5;
// int k=++a + b++ + ++b + ++a + a++ + b++;
// 	3 + 5 + 7 + 4 + 4 + 6;
// 	= 29

class inc{
	public static void main(String[] args) {
		int k=8;
		int d=++k + ++k + k++ - ++k;
		// 9+10+10-12		
		System.out.println(d);

	}
}