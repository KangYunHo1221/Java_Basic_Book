package Chpt14_Thread;

public class EX14_06 implements Runnable{
	int i;
	public EX14_06()
	{
		i=0;
	}
	
	public void run()
	{
		String name;
		try {
			while(i<10)
			{
				//get current method
				Thread thread = Thread.currentThread();
				
				//get thread name
				name = thread.getName();
				System.out.println(name + " : "+i);
				i++;
				
				//sleep
				Thread.sleep(1000);
			}
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		EX14_06 ex = new EX14_06();
		Thread thread0 = new Thread(ex, "thread00");
		Thread thread1 = new Thread(ex, "thread11");
		thread0.start();
		thread1.start();
	}
}
