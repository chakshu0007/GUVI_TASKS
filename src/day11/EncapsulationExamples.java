package day11;

public class EncapsulationExamples {
	
	private String name;
	private int age;
	
	public void seName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void getName() {
		System.out.println("Name" +name);
	}
	public void getAge() {
		System.out.println("Age" +age);
	}


}