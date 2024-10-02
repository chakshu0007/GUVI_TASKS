package day11;

public class CalculatorImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Single Inheritence Calc1--> Calc2
		Calc2 obj = new Calc2(); // object is created for Clac2 class because it has properties of Calc1 as well 
		obj.num1=10;
		obj.num2=20;
		System.out.println(obj.add()); // as add method is returning
		obj.add(); // polymorphism of method from Clas2 class / create object for Clac1 in case want to use method for Calc1
		obj.add(30); // polymorphism of method from Clac1 class
		obj.sub();
		System.out.println(obj.mul());
		obj.div();
		obj.mod();
// Multi-Level Inheritence Calc1 --> Calc2 --> Calc3
		Calc3 obj1 = new Calc3();
		obj1.num1=30;
		obj1.num2=40;
		System.out.println(obj.add()); // as add method is returning
		obj1.sub();
		System.out.println(obj.mul());
		obj1.div();
		obj1.mod();
		obj1.cos();
		obj1.tan();
// Hierarichal Inheritence - used in Framework - Calc1 --> Calc4	AND Calc1 --> Calc2	
		Calc4 obj2 = new Calc4();
		obj2.add();
		obj2.percentage();
	}

}
