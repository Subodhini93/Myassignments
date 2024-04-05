package week1.day1;

public class LearnOperators {

	public static void main(String[] args) {
		int a=2;
		int b=5;
		
//1.Arithmetic operator which is used to perform mathematical operation
		System.out.println(a+b);//7
		System.out.println(a-b);//-3
		System.out.println(a*b);//10
		System.out.println(10/b);//10/5=2 quotient
		System.out.println(10%b);//10%5= remainder 0

//2.Assignment operator used to assign value to variables
		System.out.println(a+=6);//8
		System.out.println(b-=1);//4
		
//3.comparison operator to compare two values  
		//and return to boolean value true or false
        // as we got new value above a+=6=> 2+6=8 similarly b=4 ,
		//hence given below a>b i.e 8>4 true
		System.out.println(a>b);//true
		System.out.println(b>a);// false
		
//4.Logical operator used to combine two or more boolean expression
		// and return to the boolean value true or false
		//example first AND---&&,below 8>4 true && 4>8 false hence false
		// both condition should be true to get true value
		//i.e both conditions should be satisfied otherwise false
		
		System.out.println((a>b)&&(b>a));// false
		System.out.println((a>b)&&(b<a));// true
		//For OR---|| any one condition should satisfy
		
		System.out.println((b>a)||(a>b)); // true
		
//5.Unary operator has increment and decrement operator
		// also known as the post increment operator
		
		System.out.println(b++);//4
		System.out.println(a--);//8
// note here after unary operator expression you have to print again
// again the value of a,b to get the value o/p of unary operator
		System.out.println(a);//7
		System.out.println(b);//5
	}

}
