package Chpt8_AbstractClass;

public class Member extends Person{
	
	public Member(String name, int age) //initial
	{	
		super.name = name;
		super.age = age;
	}
	
	public boolean pay()
	{
		return true; //Member is free to go
	}
	
	public boolean isMember()
	{
		return true;
	}
}
