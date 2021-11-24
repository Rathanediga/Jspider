class parent{
	public void walk(){
		System.out.println("walking");
	}

	public void drink(){
		System.out.println("drinking");
	}

	public void dance(){
		System.out.println("dancing");
	}

}

class child extends parent{
	public void eat(){
		System.out.println("having");
	}

}

class inheret{
	public static void main(String[] args) {
		parent p=new parent();
		p.walk();
		child c=new child();
		c.eat();
		c.dance();
		c.drink();
		
	}

}