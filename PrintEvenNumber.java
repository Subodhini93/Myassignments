package week1.day2;

public class PrintEvenNumber {

	public static void main(String[] args) {
		// for loop & if condition used
		
		int number=20;
		
		for (int i = 0; i <= number; i++) {
			
			if (i%2==0) {
				
				System.out.println("Even number :"+i);
			}
		}
	}

}
