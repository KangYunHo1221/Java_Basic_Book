package Chpt7__Inheritances;

public class EX07_07 extends EX07_06{
	
	public EX07_07(String str)
	{
		System.out.println(name);
		name = str;
	}
	
	public static void main(String[] args)
	{
		Object obj = new EX07_07("EX07_07");
		System.out.println(obj);
	}
}
