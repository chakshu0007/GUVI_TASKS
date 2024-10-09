package day13;

@SuppressWarnings("serial")
// creating our own exception class
public class InvalidAgeException extends Exception{

	public InvalidAgeException() {
		super();
	}
	
	public InvalidAgeException(String message) {
		
		super(message);
	}
}