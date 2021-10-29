package Chpt6__ClassPackage;

public class EX06_04_2 {
	//String Buffer2
	public static void main(String[] args) {
		StringBuffer strbuf1 = new StringBuffer("Java Programming");
		StringBuffer strbuf2 = new StringBuffer("Java Programming");
		
		if (strbuf1 == strbuf2) {
			System.out.println("In string buffer == means equals");
		}
		else {
			System.out.println("In string buffer == not means equals");
		}
		
		if (strbuf1.equals(strbuf2)) {
			System.out.println("In string buffer equls() means equals");
		}
		else {
			System.out.println("In string buffer equls() not means equals");
		}
	}
}
