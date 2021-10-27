package ClassPackage;

public class EX06_04 {
	public static void main(String[] args) {
		//String buffer
		StringBuffer strbuf = new StringBuffer("Java");
		System.out.println("starbuf = " + strbuf);
		
		strbuf.append("Programming");
		System.out.println("strbuf + programming" + strbuf);
		
		strbuf.delete(1, 3);
		System.out.println("Delete 1,3" + strbuf);
		
		strbuf.deleteCharAt(0);
		System.out.println("delete char at 0 : " + strbuf);
		
		strbuf = new StringBuffer("Java Programming");
		strbuf.replace(0, 5, "Game");
		System.out.println("Replace 0to5 with game " + strbuf);
		
		String str1 = strbuf.substring(2);
		System.out.println("Strbuf.substring(2): " + str1);
		
		strbuf.reverse();
		System.out.println("reverse : " + strbuf);
	}
}
