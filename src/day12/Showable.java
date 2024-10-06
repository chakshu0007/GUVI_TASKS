package day12;

public interface Showable extends Printable { // we can also extend the interface Printable
	
	void show();
	
	// Interface do not have its own memory, you need base class for memory allocation via obj creation
	// Interface can only have implemented methods IF default keyword is used 
	// It is introduced so that instead of changin anything in the main code, implement a method in interface(called backward compatibility)
	
	default void sample() {
		System.out.println("Default method");
	}
}
