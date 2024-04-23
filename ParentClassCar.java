package myassignments3;

public class ParentClassCar extends GrandparentClassVehicle {
	//using the normal method here
	public void gear() {
		System.out.println("gear is coming from parent class");
    // now need to connect the grandparent and parent class here using 
    // keyword ---extends from parent to grand parent
		
	}
    // here we able to inherent properties from grandparent plus parent
	// i.e apply break,horn,gear
	// we call this as single level or simple inheritance type 1- 
	// A class inherits from one parent class called single/simple inheritance
	
	public static void main(String[] args) {
		
		ParentClassCar pc = new ParentClassCar();
		pc.applyBreak();
		pc.horn();
		pc.gear();
				
	}
	
	
}
