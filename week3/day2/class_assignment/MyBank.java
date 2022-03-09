package week3.day2.class_assignment;

public class MyBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI ss = new SBI();
		ss.openAccount();
		ss.provideDebitCard();
		
		RBI RR = new SBI();
		RR.openAccount();
		RR.provideDebitCard();
	}

}
