package day10;

import java.util.Scanner;

public class CalculatorMain {

	
		// static method is executed first(as Main method is static), then constructor and then methods
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int value1 = sc.nextInt();
			int value2 = sc.nextInt();
		
			
			Calculator obj2 = new Calculator(10); //  new keyword is creating instance of a class
			
			Calculator obj1 = new Calculator(); // creating object and calling default constructor
			Calculator obj = new Calculator(value1, value2); // calling parameterised constructor
			
			
			
		//reading value from console and storing in variable
			/*System.out.println("enter value");
			obj.num1= sc.nextInt();
		
			System.out.println("enter value");
			obj.num2= sc.nextInt();
	*/
			obj.add(); // calling / invoking10 the methods
		
			int res = obj.sub();
			System.out.println("the sub value is" +res);
		
		// to call static variable and method by using class name
			Calculator.num3=40;
			Calculator.num4=10;
			Calculator.mul();

		// calling division method
			// obj.div(10,2);
		obj.div(obj.num1, obj.num2);
		
			System.out.println("enter c");
			int c = sc.nextInt();
			System.out.println("enter d");
			int d = sc.nextInt();
			obj.div(c, d);
		
			obj.division(obj.num1, obj.num2);
		}

	}


