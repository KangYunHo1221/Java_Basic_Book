package Chpt8_AbstractClass;

public abstract class Person {
	int age; //information of visitor
	final static int Young_Fee = 2000;
	final static int Adult_Fee = 5000;
	
	public String name;
	public abstract boolean pay();
	public abstract boolean isMember();
	public int getAge() {
		return age;
	}
	
	public String toString()
	{
		return "name : " + name + " , age : " + age;
	}
}
