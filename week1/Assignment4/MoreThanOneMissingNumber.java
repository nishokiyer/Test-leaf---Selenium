package week1.Assignment4;

public class MoreThanOneMissingNumber {

				    //to find more than 1 missing number in array
		    public static int[] sortArray() {    
		        
		        int array1[] = {1,2,3,4,7,6,8};
		        int arrayLength = array1.length;
		        //System.out.println(arrayLength); 
		        //sorting the array first 
		        int temp=0;
		        for (int i=0;i<arrayLength;i++)
		        {
		            for (int j=i+1;j<arrayLength;j++)
		            {
		                if (array1[i]>array1[j])
		                {
		                    temp = array1[i];
		                    array1[i]=array1[j];
		                    array1[j]=temp;
		                }
		                }
		            //System.out.println(array1[i]+" ");
		        }        
		        return array1;
		    }
		    
		    public static void main(String[] args) {    
		        int[] arr = sortArray();
		            for(int i=0;i<arr.length-1;i++)
		            {
		                if(arr[i+1]-arr[i]>1)
		                {
		                    int temp=arr[i+1]-arr[i];
		                    for(int j=1;j<temp;j++) 
		                    {
		                     System.out.print(arr[i]+j + " ");
		                    }
		                    temp=0;
		                }
	
		
	}

}
}
