package week1.Assignment1;

public class SumOfDigits {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Num = 123, Sum=0;
		while(Num>0)
		{
			Sum = Sum+ Num % 10;
			Num = Num/10;
					
		}
		System.out.println("Sum of Digit is "+ Sum);
	}

}
