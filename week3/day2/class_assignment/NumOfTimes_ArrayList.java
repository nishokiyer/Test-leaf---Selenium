package week3.day2.class_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumOfTimes_ArrayList {

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
		list.add("Adam");
		list.add("George");
		list.add("Adam");
	
		/*HashSet<String> hs = new HashSet<String>();
		hs.addAll(list);
		int Duplicates =list.size() - hs.size();
		System.out.println(Duplicates);*/
		
		int count = 0;
		for (String Member : list) {
			if(Member =="Adam"){
				count =count+1;
				
			}
		}
		
		
		System.out.println("Adam repeted " + count + " times");		
		
	}
}
