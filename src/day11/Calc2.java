package day11;

// import day10.Calculator;
// public class Calc2 extends Calculator{}
// if need to include class from another package , we need to import the class - just like using scanner class we import
public class Calc2 extends Calc1{

	public void mod() {
		result = num1 % num2;
		System.out.println("value of mod is"+result);
	}
	// method overridding - same method with same parameter in different classes -possible via inheritence
	public int add() {
		return num1 +num2 + 1; 
	}

}
