package day12;

public class FinalKeyword {
	
	final int a = 10;
	
	public final void add() {
		
		System.out.println("Final method");
	}
	
	public void sub() {
		
	}
	
	public static void main(String[] args) {
		
		FinalKeyword obj = new FinalKeyword();
		// obj.a = 20;
		
	}
}