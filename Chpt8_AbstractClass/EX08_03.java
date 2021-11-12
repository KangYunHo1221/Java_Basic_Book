package Chpt8_AbstractClass;

public class EX08_03 {
	public static void main(String[] args) {
		Person p1 = new Member("Kim", 23);
		Person p2 = new Adult("Lee", 22, 5000);
		
		System.out.println(p1); //print 하면 toString 호출
		System.out.println(p2);
	}
}
