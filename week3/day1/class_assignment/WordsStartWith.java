package week3.day1.class_assignment;

public class WordsStartWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt1 = "Testleaf is located in Tynampet above tacobell";
		System.out.println(txt1.toLowerCase());
		String txt2 = txt1.toLowerCase();
		String[] split = txt2.split(" ");
		for (int i = 0; i < split.length; i++) {
			if(split[i].startsWith("t")){
				System.out.println(split[i]);
			}
		
		}
		}
			
	}


