package guvi_tasks;
import java.util.Scanner;
public class SeniorCitizen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		int age = sc.nextInt();
		if (age<1) {
			System.out.println("Enter the correct age");
			}else if(age>1 && age<61) {
				System.out.println("Not a Senior Citizen");
			}else 
				System.out.println("Senior Citizen");	
		
		sc.close();
	}
}
