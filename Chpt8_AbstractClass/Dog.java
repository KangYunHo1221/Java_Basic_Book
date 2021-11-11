package Chpt8_AbstractClass;

public class Dog extends Animal{
	public Dog() {
		this.kind = "mammal";
	}
	
	public void sound() {
		System.out.println("bowwow");
	}
}
