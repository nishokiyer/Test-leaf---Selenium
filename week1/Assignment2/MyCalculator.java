package week1.Assignment2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj = new Calculator();
		System.out.println("Addition of three number : "+ obj.add(4,5,6));
		System.out.println("Subtraction of two number : "+ obj.sub(10,6));
		System.out.println("Multiplication of two number : "+ obj.mul(1056,600));
		System.out.println("Division of two number : "+ obj.divide(100,2));
	}

}
