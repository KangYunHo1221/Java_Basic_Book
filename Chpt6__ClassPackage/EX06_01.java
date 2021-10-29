package Chpt6__ClassPackage;

public class EX06_01 {
	public static void main(String[] args) {
		String str1 = "Hello, World!";
		String str2 = new String("Java Programming");
		String str3 = str2;
		str3 = str1 + "" + str2; //str3 = Hello world! Java Programming
		System.out.println("str3 : " + str3);
		System.out.println("str2 : " + str2); 
		
		
		int i = 0, j = 0;
		String str4 = "School";
		System.out.println(str4 + "length is : " + str4.length());
		
		i = 2;
		System.out.println(str4 + "s 2 letter : " + str4.charAt(i));
		
		if (str1.equals(str2)) {
			System.out.println("str1 equals str2");
		}
		else {
			System.out.println("str1 str2 not same");
		}
		
		String str5 = "SeouL";
		String str6 = "seoul";
		boolean b1 = str5.equalsIgnoreCase(str6);
		boolean b2 = str5.startsWith("Se");
		
		String str7 = str5.concat(" City");
	}
}
