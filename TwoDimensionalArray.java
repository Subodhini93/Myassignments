package myassignments;

public class TwoDimensionalArray {

	public static void main(String[] args) {
	//1 Declare an array and add value
	// first approach
		
	/*	int a[][] = new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]= 300;
		a[1][1]=400;
		
		a[2][0] =500;
		a[2][1] =600;
		
	*/
		
	//Second approach
		
		int a [][]= {{100,200},
				     {300,400},
				     {500,600}
		};
		
	//find length of array
		
		System.out.println("length of rows:"+ a.length);
		
		System.out.println("length of columns:"+ a[0].length);
		
	// read single value from array
		
		System.out.println(a[2][1]);
		
	// all value from array
		
		// normal for loop
		
		/*for (int r=0;r<=2;r++)
		{
			for(int c=0;c<=1;c++)
			{
				System.out.println(a[r][c]+"  ");
			}
			System.out.println();
		}
		}
		*/
		
	// enhanced for loop
	
	for(int arr []:a)
	{
		for(int x:arr)
		{
			System.out.println(x + "  ");
			
		}
		System.out.println();
	}
				    
		
}}


