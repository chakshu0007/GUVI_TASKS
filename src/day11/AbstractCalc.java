package day11;

public abstract class AbstractCalc { // need to add abstract for making the class abstract

		public abstract void add();  // method declaration and implementation can both be part of abstract class
		
		public abstract void sub();
		
		public void mul() {
			
			System.out.println("Multiplication");
		}
	}
