package Chpt3__Class;

public class EX05_08 {
	public EX05_08(){
		System.out.println("Constructor called");
	}
	
	public void finalize() {
		System.out.println("Finalize called");
	}
	
	public static void main(String[] args) {
		new EX05_08();
		System.gc();
		System.out.println("complete");
	}
}
