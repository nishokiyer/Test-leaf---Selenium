package week3.day2.Assignment;
import java.util.LinkedHashSet;
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt1 = "We learn java basics as part of java sessions in java week1";
		
		String[] split = txt1.split(" ");
		
		
		LinkedHashSet<String> s = new LinkedHashSet<String>();

        for(String name : split) {
            if(s.add(name) == false)
            	
            	
            	System.out.println(name + " is duplicated");
            }
        	for (String string : s) {
				System.out.print(string + " ");
			}
	}

}
