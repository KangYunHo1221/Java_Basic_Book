package Chpt7__Inheritances;

public class Dog extends Animal{
	public Dog() 
	{
		name = "Dog";
	}
	
	public void active_time()
	{
		System.out.println(name + " diurnal");
	}
	
	public String toString() 
	{
		return "This is Dog's toString methods";
	}
}
