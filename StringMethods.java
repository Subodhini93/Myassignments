package myassignments;

public class StringMethods {

	public static void main(String[] args) {
		//String Methods
		
		//String s = "welcome"; // u can assign variable by this Or
		
		//String s = new String("welcome"); // this way 
		
		//System.out.println(s);
		
	// method 1 length - returns length of a string (no. of characters)
		
		String s = "welcome";// or this way as well
		
		System.out.println(s.length());//7
		
		System.out.println("welcome".length());//7
		
	// method 2 concat -joining strings 
		
	    String s1= "welcome";
	    String s2="to java";
	    String s3="automation";
	    
	    System.out.println(s1+s2); // welcometo java
	    System.out.println(s1+s2+s3);// welcometo javaautomation
	    
	    System.out.println(s1.concat(s2));//welcometo java
	    System.out.println(s1.concat(s2+s3));//welcometo javaautomation
	    System.out.println(s1.concat(s2).concat(s3));//welcometo javaautomation
	    
	    System.out.println("welcome"+"to java"+"automation");
	    System.out.println("welcome".concat("to java"));
	    
	// method 3 trim - remove the spaces from left and right side
	    
	    s = "   welcome   ";
	    System.out.println(s);
		System.out.println("Before trimming:"+s.length());// 13 space plus the character 7+6 before trimming
		System.out.println(s.trim());
		System.out.println("After trimming :"+ s.trim().length()); // 7
		
	// method 4 charAt() - returns a character from string based on index
		
		// here if u want to extract 'c' from the welcome based on index were as index starts from zero'0'
		
		s= "welcome";
		
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(6));
		
	// method 5 contains() - return true / false 
	// example wel is part of welcome hence true - we use method contains () for return value true or false
		
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("come"));
		System.out.println(s.contains("Wel"));// false case sensitive
		
		
		

	}

}
