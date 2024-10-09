package task6again;

public class Person {
	    private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    public String getName() {
	        return name;
	    }
	    public int getAge() {
	        return age;
	    }

	    public static void main(String[] args) {
	        Person obj = new Person("Chakshu", 30);
	        
	        System.out.println("Name: " + obj.getName());
	        System.out.println("Age: " + obj.getAge());
	    }
}
