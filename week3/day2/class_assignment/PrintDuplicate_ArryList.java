package week3.day2.class_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicate_ArryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> list = new ArrayList<String>();
		list.add("Adam");
		list.add("Ben");
		list.add("Zara");
		list.add("Adam");
		list.add("Charlie");
		list.add("James");
		list.add("Ben");
		
		System.out.println(list);
		
		 Set<String> s = new HashSet<String>();

	        for(String name : list) {
	            if(s.add(name) == false)
	            	
	            	
	            	System.out.println(name + " is duplicated");
	            }
	                
	        }
		
		//Not sure how to get the duplicate values
	}

