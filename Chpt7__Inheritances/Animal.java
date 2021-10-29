package Chpt7__Inheritances;

public class Animal {
	private int legs = 4;
	String name = "Animal";
	
	public void walk() {
		System.out.println(name + " is walking!!");
	}
	
	public void legs() {
		System.out.println(name + " has " + legs + " legs!!");
	}
	
	//Overriding
	public boolean equals(Object obj)
	{
		if (obj instanceof Animal)
		{
			Animal animal = (Animal) obj;
			if (name != null && name.equals(animal.name) && animal.legs == legs)
			{
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() 
	{
		String str = name + legs;
		return str.hashCode();
	}
	
	public String toString() 
	{
		return "name is " + name + " , num of legs is : " + legs; 
	}
}
