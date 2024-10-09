package task7;
import java.util.Scanner;

public class InputTwoNumbers {
	int a;
	int b;
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        InputTwoNumbers obj  = new InputTwoNumbers();
	        System.out.print("Enter the first integer: ");
	        obj.a = sc.nextInt();
	        
	        System.out.print("Enter the second integer: ");
	        obj.b = sc.nextInt();
	        
	        
	        obj.divide();
	        
	        
	            sc.close();
	        }
	 
	    public void divide() {
	        try {
	            int result = a/b;
	            System.out.println("Result of division: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Cannot divide by zero.");
	        e.printStackTrace();
	        } finally {
	 
	        }
	    }
}
