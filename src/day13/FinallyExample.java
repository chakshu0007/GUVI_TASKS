package day13;

public class FinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 0;
		int c;
		
		
		
		
		try {
		c = a/ b;
		} catch (ArithmeticException e) {
			
			System.out.println("Before exit");
			System.out.println("Exception ocuured");
			System.exit(0);
			System.out.println("After exit");
		} 
		
		finally {
			
			System.out.println("Finally block of code");
		}
	}

}