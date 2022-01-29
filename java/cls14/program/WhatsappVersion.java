class WhatsappVersion1{
	public static void Filter(){
		System.out.println("enjoy the Filters");

	}

}

class WhatsappVersion2 extends WhatsappVersion1{
	public static void FingerPrint(){
		System.out.println("added a new FingerPrint");		

	}

}




class WhatsappVersion{
	public static void main(String[] args) {
		WhatsappVersion2 t=new WhatsappVersion2();
		t.Filter();
		t.FingerPrint();
		
		
		
	}
}