package day11;

public class Abstractionimplementation extends AbstractCalc{

		public void add() {							// method implementation here
			// TODO Auto-generated method stub
			System.out.println("Addition");
		}

		public void sub() {
			// TODO Auto-generated method stub
			System.out.println("Subtraction");
		}

		
		public static void main(String[] args) {
			
			Abstractionimplementation obj = new Abstractionimplementation();
			obj.add();
			obj.sub();
			obj.mul();
			
		}
	}
