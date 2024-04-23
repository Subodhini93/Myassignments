package myassignments3;

public class ChildClassBMW extends ParentClassCar {

	public void sunroof()  {
		System.out.println("sunroof is coming from child class");
	}
	
	public static void main(String[] args) {
		
		ChildClassBMW cc = new ChildClassBMW();
		cc.applyBreak();
		cc.horn();
		cc.gear();
		cc.sunroof();
		
	}
}
// here u can see when u extend to parent class u get the properties of parent and grand parent 
// because when you go to the parent class there the parent class is already extended to grandparent
// hence we get here four properties

// note u can able to extend only one class to another class
// child extends parent extends grandparent throws error 
