package Chpt13_collectinos;

import java.util.*;

public class EX13_09 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		//난수생성
		for (int i=0; i<10; i++)
			list.add((int)(Math.random()*100%100));
		
		//Iterator
		Iterator it = list.iterator();
		System.out.print("Iter : ");
		int i = 0;
		while(it.hasNext()) 
		{
			if (i++ >0)
				System.out.print(" ,");
			System.out.print(it.next());
		}
		
		//List Iterator
		ListIterator li = list.listIterator();
		System.out.print("\n ListIter : ");
		
		//마지막 요소
		while(li.hasNext())
			li.next();
		i = 0;
		
		//거꾸로 이동
		while(li.hasPrevious())
		{
			if(i++ >0)
				System.out.print(" ,");
			System.out.print(li.previous());
		}
	}
}
