package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		//Set<String> set=new HashSet<>(); // random output
		//Set<String> set=new TreeSet<>(); // sorted output
		Set<String> set=new LinkedHashSet<>();
		
		set.add("Gauri");
		set.add("Puja");
		set.add("Aklesh");
		//set.add("Puja");		
		
		
		Iterator<String> it=set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		/*
		 * for(String s:set) { System.out.println(s); }
		 */
	}

}
