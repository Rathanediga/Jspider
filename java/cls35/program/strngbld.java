class strngbld{
public static void main(String[] args) {
	String s1="shimoga";
	String s2=s1.concat("banglore");
	System.out.println(s2);

	String s3=new String("shimoga");
	String s4=s3.concat("banglore");
	System.out.println(s2);

	StringBuilder sb= new StringBuilder("shimoga");
	StringBuilder s=new StringBuilder("banglore");
	System.out.println(sb.append(s));

	StringBuffer sf= new StringBuffer("shimoga");
	StringBuffer ss=new StringBuffer("banglore");
	System.out.println(sf.append(ss));
}
}