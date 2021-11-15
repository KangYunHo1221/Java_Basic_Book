package Chpt9__Interface;
// 인터페이스는 추상클래스와 거의 흡사하다.


public class ZooKeeper {
	public void feed(Tiger tiger) {
		System.out.println("Feed apple");
	}

	/*public void feed(Lion lion) {
		System.out.println("Feed banana");
	}*/
	
	public void feed(Predator predator) {
		System.out.println("Feed " + predator.getFood());
	}
	
	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Crocodile cr = new Crocodile();
		
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
		zooKeeper.feed(cr);
	}
}
