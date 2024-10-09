package task6again;


public class Circle {
	    private double radius;

	    public Circle() {
	      this.radius = 1.0;
	    }

	    public Circle(double radius) {
	        this.radius = radius;
	    }
	    
	    public double calculateCircumference() {
	    	
	        return 2 * Math.PI * radius;
	    }
	    public static void main(String[] args) {
//	    	Scanner sc = new Scanner(System.in);
//	    	radius = sc.nextInt();
//	    	

	    	Circle obj1 = new Circle();
	        System.out.println("Circumference of Circle 1 (default radius): " + obj1.calculateCircumference());

	        Circle obj2 = new Circle(5.0);
	        System.out.println("Circumference of Circle 2 (radius = 5.0): " + obj2.calculateCircumference());
	    }
}
