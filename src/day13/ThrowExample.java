package day13;

public class ThrowExample {

	int age =15;

	// not suing our own exception class
	
//	public void checkAge() throws Exception  {
//		if(age < 18) {
//			// throw is method inside method and it is user defined exception message
//			throw new Exception("Age is not valid");
//		}
//		
//	}
	
	public void checkAge() {
		try{
			if (age<18) {
			throw new InvalidAgeException("Age is invalid"); // using our own exception class created 
			}		
		}catch (InvalidAgeException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws Exception  {
		
		ThrowExample obj = new ThrowExample();
		obj	.checkAge();
		
	}

}