abstract class user{
	public static void post()
	{
		System.out.println("post done");
	}
	abstract public void payment();
	abstract public void fingeprint();
}

class whatsapp extends user{
	@Override
	public void payment(){
		System.out.println("whatsapp payment done");
	}

	public void fingeprint(){
		System.out.println("fingeprint payment done");
		System.out.println();
	}
}

class instagram extends user{
	@Override
	public void payment(){
		System.out.println("instagram payment done");
	}

	public void fingeprint(){
		System.out.println("instagram fingeprint done");
		System.out.println();
	}
}

class zomato extends user{
	@Override
	public void payment(){
		System.out.println("zomato payment done");
		
	}

	public void fingeprint(){
		System.out.println("zomato fingeprint done");
		System.out.println();
	}
}

class usermain{
	public static void main(String[] args) {
		zomato z=new zomato();
		z.payment();
		z.fingeprint();
		user.post();

		instagram i=new instagram();
		i.payment();
		i.fingeprint();

		whatsapp w=new whatsapp();
		w.payment();
		w.fingeprint();		
	}
}