package week3.day1.class_assignment;

public class Findvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Education");
		int length = str.length();
		System.out.println(length);
	      for(int i=0; i<length; i++) {
	         if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
	            System.out.println("Education contains "+str.charAt(i)+" index value "+i);
	         }
	      }

	}

}
