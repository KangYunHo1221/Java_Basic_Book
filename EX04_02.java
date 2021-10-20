
public class EX04_02 {
	public static void main(String[] args) {
	int x, y, z;
	x=10;
	y=20;
	System.out.println(x);
	
	z= x+y;
	System.out.println(z);
	
	z= x%y;
	System.out.println(z);
	
	z += x;
	System.out.println(z);
	
	System.out.println("X > Y" + (x>y));
	
	String str = "abc";
	System.out.println((str instanceof String));
	
	Object obj = System.out;
	System.out.println((obj instanceof System));
	}
}