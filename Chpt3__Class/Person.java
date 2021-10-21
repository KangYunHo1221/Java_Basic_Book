package Chpt3__Class;

public class Person {
	int age; 
	boolean membership;
	int money;
	
	public Person(int age, int money, boolean membership) {
		this.age = age;
		this.money = money;
		this.membership = membership;
	}
	
	public int getAge() {
		return age;
	}
	public boolean isMember() {
		return membership;
	}
	public int getMoney() {
		return money;
	}
	
	public boolean pay(int money) {
		if (this.money - money < 0)
			return false;
		else
			this.money = this.money - money;
		return true;
	}
}
