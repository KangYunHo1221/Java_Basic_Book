
public class EX04_05 {
	public static void main(String[] args) {
		int x = 1000000000;
		System.out.println(bin(x));
	}
	
	public static String bin(int num) {
		String str = "";
		for (int i = 0; i <32; i++) {
			str = num%2 + str;
			num >>= 1;
		}
		return str;
	}
}
