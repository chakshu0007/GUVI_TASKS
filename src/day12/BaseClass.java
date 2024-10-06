package day12;
// This is another flow : Interface (Printable) --> Concrete Class (Base Class - where methods are implemented) 
public class BaseClass implements Printable , Showable { // 2 interfaces separated by comma

	public static void main(String[] args) {
		BaseClass obj = new BaseClass();
		obj.add();
		obj.print();
		obj.printReturn();
		obj.sample(); 
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int printReturn() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
