package myassignments;

public class SearchingforDuplicateInArray {

	public static void main(String[] args) {
		// searching for duplicate or repeated value in array 
		//Enhanced for loop
		
		int a[]= {100,200,100,300,100,400,100};
		int num =100;// we are searching this no if repeated
	    int count=0; // count is nothing but number 100 repeated initially its 0
	    
	    for(int value:a) // value is variable
	    {
	    if (value==num)
	    {
	    	count++;
	    }
	    }
	     System.out.println(count);

	}
}
