package week1.Assignment3;

public class NegtoPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num = -40;
		 if (Num < 0)
		 {
			 System.out.println("The given number is negative " + Num);
			 Num = Math.abs(Num);
		 }
		 System.out.println("The given number is positive " + Num);
		 
	}

}
