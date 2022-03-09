package week3.day1.Assignment5;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
		* b) Initialize an integer variable as count	  
 		* c) Split the String into array and iterate over it 
 		* d) Initialize another loop to check whether the word is there in the array
 		* e) if it is available then increase and count by 1. 
 		* f) if the count > 1 then replace the word as "" 
		* g) Displaying the String without duplicate words	*/
		
	
			String txt1 = "We learn java basics as part of java sessions in java week1";
			
			String[] split = txt1.split(" ");
				int count = 0;
		
				for (String string : split) {
					if(string.equals("java")) {
						count = count+1;
						
					}
					
				}
				
				System.out.println(count);
				
				/*for (int j=0; j <=lenthList-1; j++) {
					for (int K=K-j; j <=lenthList-1; j++) {		
								//System.out.println(split[j]);
						    System.out.println(split[j] +":"+split[K]);
							}
				}
					
					
				
					
					
				/*	if (i!=j) {
						if(split[i].equals(split[j])) {
							count = count +1;
						}
							
						}}
					if(count>1) {
						System.out.println(split[i] +count);
							}
								}*/
					
	}
}