package week1.Assignment1;


public class PrimeNumber {


	public boolean IsPrime(int input)
	{
		if(input<=1)
		{
			return false;
		}
		for(int i=2; i<input; i++){
				if(input % i==0) {
				return false;
			}
				
		}
		return true;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrimeNumber obj = new PrimeNumber();
		System.out.println("The Given number is Prime : " + obj.IsPrime(13));

	}

}
