package Chpt14_Thread;

public class EX14_07 implements Runnable{
	public void run()
	{
		System.out.println("Thread1 started");
		try
		{
			while(true)
			{
				if (Thread.interrupted() == true) {
					System.out.println("Thread1 interrupted");
					break;
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Thread1 ended");
	}
	
	public static void main(String[] args)
	{
		Runnable r = new EX14_07();
		
		//Create
		Thread thread1 = new Thread(r);
		thread1.start();
		System.out.println("Thread1 Created");
		
		try
		{
			Thread.sleep(1000);
			System.out.println("Thread1.interruped() befroe interrupted calling" + thread1.isInterrupted());
			
			//call interrupt
			thread1.interrupt();
			System.out.println("Thread1.interruped() after interrupted calling" + thread1.isInterrupted());
			
			
			//join
			thread1.join();
			System.out.println("Thread1 joind");	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
