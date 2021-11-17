package Chpt13_collectinos;
import java.util.*;

public class EX13_03 {
	public static void main(String[] args) {
		List list = new ArrayList();
		StringBuffer strbuf;
		
		list.add("CC");
		list.add("BB");
		list.add("aa");
		list.add(strbuf = new StringBuffer("Java "));
		strbuf.append("Programing");
		
		System.out.println("list = " + list);
	}
}
