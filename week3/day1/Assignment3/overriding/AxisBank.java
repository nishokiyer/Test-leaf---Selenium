package week3.day1.Assignment3.overriding;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("deposit() in AxisBank is called");
		super.deposit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo BI = new BankInfo();
		BI.deposit();
				
		AxisBank BB = new AxisBank();
		BB.deposit();

	}

}
