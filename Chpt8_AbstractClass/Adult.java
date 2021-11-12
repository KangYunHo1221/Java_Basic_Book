package Chpt8_AbstractClass;

public class Adult extends Person{
	int money;
	public Adult(String name, int age, int money)
	{
		this.name = name;
		this.age = age;
		this.money = money;
	}
	
	public boolean pay()
	{
		if (money - Adult_Fee >= 0) {
			money -= Adult_Fee;
		}
		else
			return false;
		return true;
	}
	
	public boolean isMember()
	{
		return false;
	}
}
