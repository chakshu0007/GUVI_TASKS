package day11;

public class Calc1 {

	int num1;
	int num2;
	int result;
	
	public int add() {
		return num1 +num2;
	}
	// method overloading - same method with different parameter
	public int add(int num3) {
		return num1 +num2 + num3;
	}
	
	
	public void sub() {
		result = num1 -num2;
		System.out.println("subtraction value is" +result);
	}
	public int mul() {
		return num1 *num2;		
	}
	public void div() {
		result = num1 /num2;		
		System.out.println("division value is" +result);
	}

}
