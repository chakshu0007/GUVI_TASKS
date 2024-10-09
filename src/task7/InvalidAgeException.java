package task7;

import java.util.Scanner;

public class InvalidAgeException {

		public static void main(String[] ags) throws Exception {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the age");
			int age = sc.nextInt();
			try {
				if(age < 18) {
					throw new Exception("Age is not valid");
				}else {
					System.out.println("Corretc age");
				}
			}
			finally{

			}
			
			
	}
}
