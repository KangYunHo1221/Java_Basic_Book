package Chpt13_collectinos;

import java.util.*;

public class EX13_02 {
	public static void main(String[] args) {
		Vector vec = new Vector();
		StringBuffer strbuf;
		vec.add("Collection");
		vec.add("Set");
		vec.add("Sorte");
		vec.add("Map");
		vec.add(strbuf = new StringBuffer("Java"));
		strbuf.append("Programing"); //vetor 특징때문에 알아서 저장됨
		
		System.out.println("Vec = " + vec);
	}
}
