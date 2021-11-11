package Chpt8_AbstractClass;

public class Cat extends Animal{
	public Cat() {
		this.kind = "Mammal";
	}
	
	public void sound() {
		System.out.println("Meww");
	}
}
