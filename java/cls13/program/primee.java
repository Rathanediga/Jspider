
class primee{
	public static void main(String[] args) {
		int n=20;
		int count=0;
		for (int i=2;i<=n ;i++ ) {
			for (int j=2;j<i ;j++ ) {
				if (i%j==0) {
					count++;
					
				}

				
			}
			if (count==0) {
				System.out.println(i+" ");
				
			}
			
		}
	}
}
