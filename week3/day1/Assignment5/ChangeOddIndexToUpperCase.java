package week3.day1.Assignment5;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
			
		String test = "changeme";
		int len = test.length();
		for (int i=0; i < len; i++) {
			char Upper = test.charAt(i);
			if (i%2!=0) {
			String sttr = (Upper+"");
			System.out.print(sttr.toUpperCase());	
			}else if (i%2==0) {
			System.out.print(test.charAt(i));
						}	
					}
				}
			}


