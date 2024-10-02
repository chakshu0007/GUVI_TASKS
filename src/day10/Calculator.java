package day10;

import java.util.Scanner;

public class Calculator {

	// variables
	// instance variable declared inside class and outside method - can be accessed by obj
	int num1;
	int num2;
	int result;
	
	static int num3;
	static int num4;
	static int res;

	// constructor overloading having same constructor/method name with diff parameters
	//constructor 
	public Calculator(int num) {
		
		System.out.println(num);
	}
	// default constructor
	public Calculator() {
		System.out.println("default cobstructor");
		
	}
	// parameterised constructor
	public Calculator(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
		
	}
	
	//methods
		
	public void add() {
		result = num1 + num2;
		System.out.println("addition value is" + result);
	}
	public int sub() {
		result=num1 - num2;
		return result;
	}
	
	public static void mul() {
		res = num3 *num4;
		
		System.out.println("multiply value is" +res);
	}
	// local variables declared inside method
	// cannot be accessed by obj- can access via method
	public void div(int a , int b) {
		result = a/b;
		System.out.println("divion value is" +result);
		
	}
	// when passing variable inside method is called parameter
	public void division(int num1 , int num2) {
		this.num1=num1;
		this.num2=num2;
		result = num1/num2;
		System.out.println("division value is "+result);
	}

}

