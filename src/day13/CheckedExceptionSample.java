package day13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CheckedExceptionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {								// try block throws the exception
			FileOutputStream file = new FileOutputStream("C:\\Users\\chakshug\\eclipse-workspace\\JavaProblems\\src\\day13\\sample.txt");
		} catch (FileNotFoundException e) { // catch block handles the exception
			e.printStackTrace(); // removing this will not print the exception type
		}
	}

}
