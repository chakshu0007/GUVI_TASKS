package day11;
// Calc3 inherits Calc2 and Calc2 inherit Calc1 - called multi-level inheritence
public class Calc3 extends Calc2{
	public void cos() {
		System.out.println("COS");
	}
	public void tan() {
		System.out.println("TAN");
	}
}

// this is not supported - multiple inheritence - we should use interface
// public class Calc3 extends Calc2 , Calc1 - not supported by java
// public Clac3 extends Calc2 implements Calc1
