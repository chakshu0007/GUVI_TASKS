package task7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileNotFoundExeption {

	public static void main(String[] args) throws Exception{
		
		try {				
			FileOutputStream file = new FileOutputStream("C:\\Users\\chakshug\\eclipse-workspace\\JavaProblems\\src\\day1\\sample.txt");
		} catch (FileNotFoundException e) { 
			throw new Exception("File not found");
			
			}
	}
}
