package Chpt7__Inheritances;
	
public class EX07_01 {
	public static void main(String[] args)
	{
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		//parent's cannot call childs' methods
		cat.walk();
		dog.walk();
		cat.legs();
		dog.legs();
		
		
		//child can call parents' methods
		Cat cat2 = new Cat();
		cat2.active_time();
		cat2.walk();
	}
}
