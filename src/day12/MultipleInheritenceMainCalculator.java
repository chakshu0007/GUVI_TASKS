package day12;
// achieve methods of both classes, change any one class to interface(MultipleInheritenceSciCalculator)
public class MultipleInheritenceMainCalculator extends MultipleInheritenceCalculator implements MultipleInheritenceSciCalculator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritenceMainCalculator obj = new MultipleInheritenceMainCalculator();
		obj.add();
		obj.sub();
		obj.cos();
		obj.tan();
	}

	@Override
	public void cos() {
		// TODO Auto-generated method stub
		System.out.println("cos");
	}

	@Override
	public void tan() {
		// TODO Auto-generated method stub
		System.out.println("tan");
	}

}
