class user{
	public void send(){
		System.out.println("send() done");
	}
}

class sample extends user{
	@Override
	public void send(){
		System.out.println("send() done by overriding");
	}

	
	public void recieve(){
		System.out.println("recieve() done");
	}
}


class goldrulemethovrrdngphly{
	public static void main(String[] args) {
		user u1=new sample();
		u1.send();
		// u1.recieve();
		
	}
}