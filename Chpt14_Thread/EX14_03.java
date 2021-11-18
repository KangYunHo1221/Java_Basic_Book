package Chpt14_Thread;

public class EX14_03 extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Thread 1: " + i);
				sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Thread thread = new EX14_03();
		thread.start();

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Thread 0 :" + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
