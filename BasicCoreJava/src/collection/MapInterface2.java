package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Map <Integer, String> std= new HashMap<>();
	
	std.put(1, "Gauri");
	std.put(2, "Anand");
	std.put(3, "Anshika");
	System.out.println(std.get(2));
	
	Set <Integer> set= std.keySet();
	
	for (int key:set)
	{
	System.out.println(std.get(key));
	}
	
	}

}
