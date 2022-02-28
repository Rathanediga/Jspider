// Program to check Armstrong numbers in a certain interval

class armstrongNum{
	public static void main(String[] args) {
		int n=153;
		int temp=n;
		int i,sum=0;

		while(n>0){
			i=n%10;
			sum=sum+i*i*i;
			n=n/10;
			
		}

		if(sum==temp){
			System.out.println("armstrongNum");
		}
		else{
			System.out.println("not a armstrongNum");
		}


	}
}