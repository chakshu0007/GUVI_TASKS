package day13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

	public class ThrowsExample {

		// Throws will tell the method is capable of throwing the exeption and it supresses it
		// method fileHandle throwing exception to method file()
		public void fileHandle() throws FileNotFoundException {
			FileOutputStream file = new FileOutputStream("C:\\Users\\chakshug\\eclipse-workspace\\JavaProblems\\src\\day13\\sample.txt");

		}
		
		public void file() throws FileNotFoundException{
			// calling the method so it is capable of throwing exception
			fileHandle();
		}
		
		public static void main(String[] args) {
			// handing the exception in main method using try catch
			ThrowsExample obj  = new ThrowsExample();
				try {
					obj.file();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			}
		}



