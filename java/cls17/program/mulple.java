class A{  
void msg(){
	System.out.println("Hello");}  
}  
class B{  
void msg(){
	System.out.println("Welcome");}  
}  
class mulple extends A,B{  
   
 public static void main(String args[]){  
   mulple obj=new mulple();  
   obj.msg();//Now which msg() method would be invoked?  
}  
}

