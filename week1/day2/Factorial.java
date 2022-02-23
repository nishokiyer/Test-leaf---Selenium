package week1.day2;

public class Factorial {
	static double fact = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(double i =1; i<=100; i++)
		{
			fact =  fact*i;
			System.out.println("factorial of " + i +" is " + fact);	
		}
			
	}

}
