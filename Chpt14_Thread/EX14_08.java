package Chpt14_Thread;

public class EX14_08 extends Thread{
	public void run()
	{
		System.out.println("min priority : " + MIN_PRIORITY);
		System.out.println("norm priority : " + NORM_PRIORITY);
		System.out.println("max priority : " + MAX_PRIORITY);
		
		try
		{
			System.out.println("Thread started");
			System.out.println("Thread1 priority starts : " + getPriority());
			
			sleep(500);
			
			setPriority(2);
			System.out.println("Thread1 priority is : " + getPriority());
			
			System.out.println("thread1 ended");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		Thread thread0 = Thread.currentThread();
		Thread thread1 = new EX14_08();
		
		System.out.println("Thread0 prioiry : " + thread0.getPriority());
		System.out.println("Thread1 prioiry : " + thread1.getPriority());
		System.out.println("Thread1 Alive ?? : " + thread1.isAlive());
		
		thread1.start();
		thread1.setPriority(1);
		try 
		{
			Thread.sleep(100);
			System.out.println("Thread1 Alive ?? : " + thread1.isAlive());
			thread1.join();
			System.out.println("Thread1 Alive after join?? : " + thread1.isAlive());
			
			thread1.setPriority(3);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
