package week3.day2.Assignment;

import java.util.Arrays;
import java.util.HashSet;


public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int Arr1[]= {3,2,11,4,6,7};	 
		 int Arr2[]={1,2,8,4,9,7};
		 HashSet<int[]> s1 = new HashSet<int[]>(Arrays.asList(Arr1));
	     HashSet<int[]> s2 = new HashSet<int[]>(Arrays.asList(Arr2));
	 
	     s1.retainAll(s2);
	        System.out.println(s1);
	        
		 
	}

}
