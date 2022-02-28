class Manipulation{ //Super class
public void add(int a,int b){
    System.out.println(a+b);
}
}
class polymorp extends Manipulation{ // Sub class
public void add(int c,int d){
    System.out.println(c+d);
}
public static void main(String args[]){
Manipulation polymorp = new polymorp();//Manipulation is reference type and Addition is reference type
polymorp.add(5,8);
}
}