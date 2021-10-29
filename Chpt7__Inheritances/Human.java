package Chpt7__Inheritances;

public class Human extends Animal{
	public Human()
	{
		name = "mankind";
		legs = 2; // Error private class
		
		int legs; // reDeclare
		legs  = 2;
	}
}
