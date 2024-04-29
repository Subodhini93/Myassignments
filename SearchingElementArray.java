package myassignments;

public class SearchingElementArray {

	public static void main(String[] args) {
		// Searching element in array -linear search
		// by normal for loop
		
		int a[]= {14,30,16,22,11,78,65,34,45,90,7,45};
		
		int search_element =110;
		
		boolean status = false; // if element not found
		
		for(int i=0;i<a.length;i++)
		{
			if (a[i]==search_element)
			{
				System.out.println("Element found");
				status= true;
				break;
			}
		}
		
			if (status==false)
			
			{
				System.out.println("Element Not found");
				
			}

	}

}
