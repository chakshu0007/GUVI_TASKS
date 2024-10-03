package task5;
import java.util.Scanner;
	public class ReverseString {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = scanner.nextLine();
	        for (int i=0; i<str.length(); i++) {
	        	 
	        }
	        String rev = new StringBuilder(str).reverse().toString();
	        System.out.println("Reversed string: " + rev);

	        scanner.close();
	    }

		
	}

