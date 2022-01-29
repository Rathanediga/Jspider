abstract class user{
	abstract public void send();
	abstract public void recieve();
}

class sample extends user{
	@Override
	public void send(){
		System.out.println("send() done");
	}

	@Override
	public void recieve(){
		System.out.println("recieve() done");
	}
}


class methovrrdngphly{
	public static void main(String[] args) {
		sample s=new sample();
		s.send();
		s.recieve();
		
	}
}