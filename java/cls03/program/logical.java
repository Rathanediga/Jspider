// int g=6;
// int h=8;

// g>h || h==g || h>=g || h!=g
// 0 || 0 || 0 || 1
// True

// =====================================
// int y=7;
// int g=9;
// int c=3;
// g==c && y>=c && g>c || c>=y
// 0 && 1 && 1 || 0
// 0 && 1
// False


// =====================================

// int v=10;
// int k=21;
// & | ^

// 01010       |   01010       |   01010
// 10101(&)    |   10101(|)    |   10101(^)
// ---------   |------------   |---------
// 00000       |   11111       |   11111


class logical{
	public static void main(String[] args) {
		int y=7;
		int g=9;
		int c=3;
		boolean a=g==c && y>=c && g>c || c>=y	;
		System.out.println(a);

	}
}