package task7;
import java.util.Scanner;

public class BoundException {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();
	        
	        int[] array = new int[size];
	        
	        try {
	            System.out.print("Enter an index to access in the array: ");
	            int index = sc.nextInt();
	            System.out.println("Value at index " + index + ": " + array[index]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Array index is out of bounds.");
	        }

	    
	        sc.nextLine(); 
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();
	        
	        try {
	            System.out.print("Enter an index to access in the string: ");
	            int stringIndex = sc.nextInt();
	            System.out.println("Character at index " + stringIndex + ": " + str.charAt(stringIndex));
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Error: String index is out of bounds.");
	        } finally {
	            sc.close();
	        }
	    }
	}
