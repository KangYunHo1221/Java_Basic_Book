package Chpt8_AbstractClass;

public abstract class Animal {
	public String kind;
	
	public void breath() {
		System.out.println("Breathing");
	}
	
	public abstract void sound(); //abstract method
}
