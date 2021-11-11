package Chpt8_AbstractClass;

public class AnimalEx {
	public static void main(String[] args) {
	Dog dog = new Dog();
	Cat cat = new Cat();
	
	dog.sound();
	cat.sound();
	
	Animal animal = null;
	animal = new Dog();
	animal.sound();
 }
}