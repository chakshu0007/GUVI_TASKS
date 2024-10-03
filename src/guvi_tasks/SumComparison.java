package guvi_tasks;
import java.util.Scanner;

	public class SumComparison {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int a, b, c, d;
	        System.out.print("Enter value for a: ");
	        a = sc.nextInt();
	        System.out.print("Enter value for b: ");
	        b = sc.nextInt();
	        System.out.print("Enter value for c: ");
	        c = sc.nextInt();
	        System.out.print("Enter value for d: ");
	        d = sc.nextInt();

	        if ((a + b) > (c + d)) {
	            System.out.println("The sum of a and b is greater than the sum of c and d.");
	        } else {
	            System.out.println("The sum of a and b is not greater than the sum of c and d.");
	        }

	        sc.close();
	    }
	}
