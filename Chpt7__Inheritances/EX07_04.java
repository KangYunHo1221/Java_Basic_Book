package Chpt7__Inheritances;

public class EX07_04 {
	public static void main(String[] args)
	{
		Animal animal = new Animal();
		int legs = 0;
		legs = animal.legs; //Error because legs is private
	}
}
