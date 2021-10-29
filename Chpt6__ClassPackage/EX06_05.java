package Chpt6__ClassPackage;

//Wrapper class
//Use primitive type as Object
public class EX06_05 {
	public static void main(String[] args) {
		//Primitive -> object
		Integer a = new Integer(1000);
		Short b = new Short((short)10000);
		Long c = new Long(10000);
		
		//Object -> primitive
		long j = Long.parseLong("100000");
		float k = Float.parseFloat("3.1313");
		boolean o = Boolean.valueOf("True").booleanValue();
		
		String str = "100,000,000.12";
		java.text.DecimalFormat p = new java.text.DecimalFormat();
		try {
			Number q = p.parse(str);
			double r = 0;
			if (q instanceof Double) r = ((Double)q).doubleValue();
			System.out.println("Str (" + str +") is " + r);
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
} 
