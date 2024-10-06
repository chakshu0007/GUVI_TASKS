package day12;

public interface Printable {
	// Interface do not have its own memory, you need base class for memory allocation via obj creation
	
	void print();
	
	public abstract int printReturn();
	
	void add();
	
}
