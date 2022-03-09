package week3.day1.Assignment5;

import org.apache.poi.util.SystemOutLogger;

public class Palindrome {

	public static void main(String[] args) {
		String Str = "Madam";
		String Rev = "";
		int len = Str.length()-1;
		//System.out.println(len);
		for (int i = len; i >=0; i--) {
			Rev = Rev + Str.charAt(i);
				}
		if(Str.equalsIgnoreCase(Rev))	{
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
			
		}
	}
}
			
	


