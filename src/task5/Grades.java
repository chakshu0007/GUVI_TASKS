package task5;
import java.util.Scanner;

public class Grades {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the marks: ");
	        int marks = scanner.nextInt();
	        char grade;

	        if (marks == 100) {
	            grade = 'S';
	        } else if (marks >= 90 && marks <= 99) {
	            grade = 'A';
	        } else if (marks >= 80 && marks <= 89) {
	            grade = 'B';
	        } else if (marks >= 70 && marks <= 79) {
	            grade = 'C';
	        } else if (marks >= 60 && marks <= 69) {
	            grade = 'D';
	        } else if (marks >= 50 && marks <= 59) {
	            grade = 'E';
	        } else {
	            grade = 'F';
	        }
	        System.out.println("Marks = " + marks + ", Grade = " + grade);
	        scanner.close();
	}
}
