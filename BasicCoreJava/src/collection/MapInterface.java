package collection;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Map<String, String> map= new HashMap <>();
	
	map.put("name",  "Gauri");
	map.put("email", "gauridabhade32@gmail.com");
	map.put(null,  "jhgfd");
	
	System.out.println(map.get("name"));
	System.out.println(map.get("email"));
	System.out.println(map.get(null));
	
	}

}
