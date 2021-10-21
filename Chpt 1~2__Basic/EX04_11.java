
public class EX04_11 {
	public static void main(String args[]) {
		//list char
		char str0[] = {'H', 'E', 'L', 'L','O'};
		System.out.println(str0);
		
		//string
		String str1 = "Hello";
		System.out.println(str1);
		 
		//new string
		String str2 = new String("Hello");
		System.out.println(str2);
		
		//String +
		String str3 = str1 + str2;
		System.out.println(str3);
		
		//String Buffer
		StringBuffer str4 = new StringBuffer("Hello");
		str4.append(str3);
		System.out.println(str4); 
	}
}
