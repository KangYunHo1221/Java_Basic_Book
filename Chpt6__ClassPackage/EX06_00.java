package Chpt6__ClassPackage;

import java.io.LineNumberReader;
import java.io.InputStreamReader;

public class EX06_00 {
	public static void main(String[] args) {
		String str;
		try 
		{
			System.out.print("input: ");
			LineNumberReader rd = new LineNumberReader(new InputStreamReader(System.in));
		str = rd.readLine();
		float f1 = Float.parseFloat(str);
		System.out.println("output : " + f1*2.1);
		}
	catch(Exception e) {}
	}
}
