package Chpt3__Class;

public class EX05_00 {
	Person p1;
	public EX05_00() {
		p1 = new Person(23, 0, false);
	}
	
	Person p3 = new Person(19, 10000, false);
	
	public static void main(String[] args) {
		Person p2;
		Person p4 = new Person(20, 4000, true);
		
		EX05_00 ex = new EX05_00();
		
		MuseumAdmission ma = new MuseumAdmission();
		
		ma.enter(p4);
	}
}
