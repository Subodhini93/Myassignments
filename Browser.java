package week1.day1;

public class Browser {
	
	//global variable outside the main method is in blue color
	// local variable inside the main method is in brown color
	int age = 34;

	public static void main(String[] args) {
		//DataType variableName = value
		// inside main method if variable is created 
		//it is called as localVariable
		
		//browser version comes under float datatype (no quote)
 // f or F after float value
		float browserVersion = 123.65f;
		
		// No.of tabs opened comes under int datatype (no quote)
		int tabOpens = 5;
		 
		//company logo first charachter comes under char datatype
		// (single quote)
		char logo = 'C';
		
		//Application loaded or not comes under boolean datatype
		//(no quote)
		boolean applicationLoaded = true;
		
		// version under double datatype
		double version = 12.6568365;
		
		// string is in black colour which is non primitive datatype
		// black color written are user defined
		// purple written is pre defined datatype
		
		String name = "chrome";
		
		System.out.println(browserVersion +"\n"+tabOpens+"\n"+logo+"\n"+applicationLoaded+"\n"+version+"\n"+name);
	}

}
//if variable outside main method called globalVariable
// float,int,boolean etc given above used only inside browser class but
// int which global variable can be reused in another class used globally

