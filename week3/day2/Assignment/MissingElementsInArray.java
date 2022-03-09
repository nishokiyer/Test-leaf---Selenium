package week3.day2.Assignment;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class MissingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1,2,3,4,7,6,8};

			
		ArrayList<Integer> listname= new ArrayList<Integer>( Arrays.asList(arr));
		Collections.sort(listname);

		int calc=0;
		for (int i = 0; i < arr.length-1; i++) {
			if((((listname.get(i+1)))-(listname.get(i))==1)) {
				
			}else System.out.println("Missing number is "+(listname.get(i)+1));
		}
		
			}

}

