package myassignments;

// 1. Declare an array
// 2. add values into array
// 3. find size(length ) of an array
// 4. read single value from an array
// 5. read multiple values from array

public class SingleDimentionalArray {

	public static void main(String[] args) {
  // 1 Declare an array there are two approach
		// first approach
		
		/*int a[]= new int [5]; // declaration
		
		a[0]= 100; // assign the value
		a[1]= 200;
		a[2]= 300;
		a[3]= 400;
		a[4]= 500;
		*/
		
      // second approach 
		
	   int a[]= {100,200,300,400,500};
	   
	// 2 find length of array
	   
	   //System.out.println("Length of an array "+a.length);
	   
    // 3 read specific single value from an array
	   
	   //System.out.println(a[4]); // here 4 is index no
	   
	   
	// 4 reading all the value from an array using normal for loop
	   
	   //for(int i = 0;i<=a.length-1; i++) // u can use condition i<=4 ,i<5, i<= a.lenght, i<= a.lenght-1
		   // but if u put i<5 or i<= a.length throws exception
	  // {
		  // System.out.println(a[i]);
		   
	   //}
	// 5 enhanced for loop mostly used in array and collection concept
	   
	   for (int x:a)
	   {
		   System.out.println(x);
	   }
	   }
	   }
	  
	   


