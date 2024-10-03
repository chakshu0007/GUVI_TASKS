package guvi_tasks;
import java.util.Scanner;

	public class SwapNumbers {
		public static void main(String[] args) {
			int num1 , num2;
			Scanner sc = new Scanner(System.in);
		    System.out.print("Enter the first number: ");
	        num1 = sc.nextInt();

	        System.out.print("Enter the second number: ");
	        num2 = sc.nextInt();

	        System.out.println("Before swapping: ");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);
	        
	        int temp = num1; 
	        num1 = num2;     
	        num2 = temp;     

	        System.out.println("After swapping: ");
	        System.out.println("First number: " + num1);
	        System.out.println("Second number: " + num2);

	        sc.close();
	    }
	
}
