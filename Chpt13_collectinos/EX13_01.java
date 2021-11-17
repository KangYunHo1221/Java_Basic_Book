package Chpt13_collectinos;
import java.util.*;

public class EX13_01 {
	public static void main(String[] args)
	{
		Set tree = new TreeSet();
		tree.add("Java");
		tree.add("Zagu");
		tree.add("Treeset");
		System.out.println("Tree = " + tree);
		
		tree.clear();
		
		tree.add(123);
		tree.add(new Integer(20));
		tree.add(new Integer(5));
		tree.add(new Integer(25));
		tree.add(new Integer(45));
		System.out.println("Tree = "+ tree);
		
		SortedSet set = ((TreeSet)tree).subSet(new Integer(20),new Integer(25));
		System.out.println("min = " + set.first());
		System.out.println("Max = " + set.last());
	}
}
