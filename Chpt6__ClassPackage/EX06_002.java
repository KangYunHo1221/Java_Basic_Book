package Chpt6__ClassPackage;

public class EX06_002 {
	public static void main(String[] args) {
		String str1 = "Love";
		String str2 = "Love Jeju";
		String str3 = str1 + " Jeju";
		
		
		//Look same But not same
		if(str2 == str3) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not Same");
			System.out.println(str2 + "\n" + str3);
		}
		
		//Use equals
		if(str2.equals(str3)) {
			System.out.println("Same");
		}
	}
}