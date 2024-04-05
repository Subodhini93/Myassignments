package week1.day2;

public class LearnSwitchCase {

	public static void main(String[] args) {
		
		String browser = "Alho";
		
		switch (browser) {
		case "chrome":
			System.out.println("chrome browser launched");
			
			break;
		case "safari":
			System.out.println("safari browser launched");
			
			break;
		case "Firefox":
			System.out.println("Firefox browser launched");
			
			break;
		case "edge":
			System.out.println("edge browser launched");
			
			break;
			
		default:
			System.out.println("Opera browser launched");
		}

	}

}
