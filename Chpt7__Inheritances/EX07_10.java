package Chpt7__Inheritances;

public class EX07_10 extends EX07_07{
	public EX07_10()
	{
		super("EX07_10!!");
	}
	
	public void new_method()
	{
		System.out.println("EX07_10s new method() ");
	}
	
	public static void main(String[] args)
	{
		EX07_10 ex = new EX07_10();
		ex.new_method();
		
		
		//compile error.. ex07 is parent -> cannot call child method
		EX07_07 ex1 = ex;
		ex1.new_method()
	}
}
