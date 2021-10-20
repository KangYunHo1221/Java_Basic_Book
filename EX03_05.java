
public class EX03_05 {
	static int i = 0;
	static final int j = 10;
	
	public static void main(String[] args) {
		EX03_05 a = new EX03_05(); //Use class as identirer
		EX03_05 b = new EX03_05(); //ex) String
		System.out.println(a);
		System.out.println("i is : " + i);
		System.out.println("J is : " + j);
	}
	public static String getName() {
		String str = "Test Name";
		return str;
	}
}
