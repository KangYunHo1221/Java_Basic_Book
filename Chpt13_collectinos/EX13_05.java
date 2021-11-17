package Chpt13_collectinos;
import java.util.*;

public class EX13_05 {
	public static void main(String[] args) {
		Map map = new HashMap();
		String melon = "su";
		map.put("Apple", "A");
		map.put("Peach", "P");
		map.put("melon", "M");
		System.out.println(map);
		
		map.put("melon", melon);
		System.out.println(map);
		
		map.put("Watermelon", melon);
		System.out.println(map);
	}
}
