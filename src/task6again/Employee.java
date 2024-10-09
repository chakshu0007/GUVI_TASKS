package task6again;

import java.util.Scanner;

public class Employee {

	static int ID;
	static String firstname;
	static String lastname;
	static int salary , raise;
	int newsalary;
	
	public void raiseSalry() {
		newsalary = salary + (salary * raise) / 100;
		System.out.println("Raised salary of employee " +firstname +" " +lastname +" is :" +newsalary);
 		
	}
//	public Employee(int ID , String firstname , String lastname , int salary) {
//		this.ID = ID;
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.salary = salary;
//		
//		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee ID");
		ID = sc.nextInt();
		
		System.out.println("Enter salary");
		salary = sc.nextInt();
		
		System.out.println("Enter percentage raise");
		raise = sc.nextInt();
		
		System.out.println("Enter first name");
		firstname = sc.next();
		
		System.out.println("Enter last name");
		lastname = sc.next();
				
		sc.close();
	
		Employee obj = new Employee ();
		obj .raiseSalry();
	}

}
