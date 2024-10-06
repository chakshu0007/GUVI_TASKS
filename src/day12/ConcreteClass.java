package day12;
// This is one flow Interface(Printable) --> Abstract Class(InterfaceImplementation) --> Concrete Class(method implementation)
public class ConcreteClass extends InterfaceImplementation{

	public static void main(String[] args) {
		
		ConcreteClass obj = new ConcreteClass();
		obj.print();
		System.out.println(obj.printReturn());
		
	}

	@Override
	public int printReturn() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Addition");
	}		
	
}
