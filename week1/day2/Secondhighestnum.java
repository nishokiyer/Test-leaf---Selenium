package week1.day2;

import java.util.Arrays;

public class Secondhighestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Value[] = {10,20,40,30,60,70,90};
		Arrays.sort(Value);
		
		for(int i=0; i <=Value.length-1;i++)
		{
		System.out.println(Value[i]);
		}
	
	//Highest value
		
		System.out.println("First Highest value " + Value[Value.length-1]);
		System.out.println("Second Highest Value " + Value[Value.length-2]);
	}

}
